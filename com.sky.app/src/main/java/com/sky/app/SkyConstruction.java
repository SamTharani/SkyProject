package com.sky.app;

import com.sky.app.web.LoginFailureHandler;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.test.ImportAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import java.util.HashMap;

@EnableAutoConfiguration
@ImportAutoConfiguration(SkyConstructionConfig.class)
public class SkyConstruction extends WebMvcConfigurerAdapter{

    public static void main(String[] args) {

        Config config = ConfigFactory.load().getConfig("sky.construction");
        HashMap<String, Object> props = new HashMap<>();
        props.put("server.address", config.getString("host"));
        props.put("server.port", config.getInt("port"));

        new SpringApplicationBuilder().sources(SkyConstruction.class)
                .properties(props)
                .run(args);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/www/static").setCachePeriod(60 * 60 * 2);
    }

    @Configuration
    protected static class ThymeleafConfiguration {
        @Bean
        public ServletContextTemplateResolver templateResolver() {
            ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
            resolver.setPrefix("/www/template/");
            resolver.setSuffix(".html");
            resolver.setTemplateMode("HTML5");
            resolver.setCacheable(true);
            return resolver;
        }
    }

    @Configuration
    protected static class EmbeddedServletContainer implements EmbeddedServletContainerCustomizer {
        public EmbeddedServletContainer() {
        }

        @Override
        public void customize(ConfigurableEmbeddedServletContainer container) {
            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/static/404.html"));
            container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/static/500.html"));
        }
    }


    @Configuration
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected static class ApplicationSecurity extends WebSecurityConfigurerAdapter {

        @Autowired
        private SecurityProperties security;

        @Autowired
        private UserDetailsService userDetailsService;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.headers().cacheControl().disable()
                    .authorizeRequests()
                    .antMatchers("/static*/*").permitAll()
                    .antMatchers("/login-error").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin()
                    .loginPage("/login")
                    .failureHandler(new LoginFailureHandler())
                    .permitAll()
                    .and()
                    .logout()
                    .logoutRequestMatcher(new AntPathRequestMatcher("/sign-out", "GET"))
                    .permitAll()
                    .and()
                    .csrf()
                    .requireCsrfProtectionMatcher(httpServletRequest -> {
                        return false;
                    });
        }

        @Override
        public void configure(AuthenticationManagerBuilder auth) throws Exception {
            DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
            authenticationProvider.setUserDetailsService(userDetailsService);
            authenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
            auth.authenticationProvider(authenticationProvider);
        }

    }

}
