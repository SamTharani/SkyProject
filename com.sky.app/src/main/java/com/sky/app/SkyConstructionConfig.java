package com.sky.app;

import com.sky.app.service.ServiceModule;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceModule.class)
@ComponentScan(basePackages = {"com.sky.app.web"})
public class SkyConstructionConfig {
}
