package com.sky.app.repo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.mongodb.*;
import com.sky.app.domain.*;
import com.sky.app.repo.impl.BranchRepoImpl;
import com.sky.app.repo.impl.EmployeeRepoImpl;
import com.sky.app.repo.impl.ManagerRepoImpl;
import com.sky.app.repo.impl.ProjectRepoImpl;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.mongojack.JacksonDBCollection;
import org.mongojack.internal.MongoJackModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;

@Configuration
public class RepoModule {

    private static ObjectMapper MONGO_JACK_MAPPER = MongoJackModule.configure(
            new ObjectMapper()
    ).registerModule(
            new Jdk8Module()
    );

    @Bean
    Config appConfig() {
        return ConfigFactory.load().getConfig("sky.construction");
    }

    @Bean
    public DB mongoClient(Config config) {
        try {
            Config mongo = config.getConfig("mongo");

            String uri = mongo.getString("url");
            String db = mongo.getString("db");

            MongoClient mongoClient = new MongoClient(new MongoClientURI(uri));

            mongoClient.setReadPreference(ReadPreference.primaryPreferred());
            mongoClient.setWriteConcern(WriteConcern.JOURNALED);

            return mongoClient.getDB(db);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }


    @Bean
    public BranchRepo branchRepo(DB db){
        return new BranchRepoImpl(JacksonDBCollection.wrap(db.getCollection("branch"),
                Branch.class,
                String.class,
                MONGO_JACK_MAPPER));
    }
    @Bean
    public EmployeeRepo employeeRepo(DB db){
        return new EmployeeRepoImpl(JacksonDBCollection.wrap(db.getCollection("employee"),
                Employee.class,
                String.class,
                MONGO_JACK_MAPPER));
    }
    @Bean
    public EmployeeDependentRepo employeeDependentRepo(DB db){
        return new EmployeeRepoImpl(JacksonDBCollection.wrap(db.getCollection("employee-dependent"),
                EmployeeDependent.class,
                String.class,
                MONGO_JACK_MAPPER));
    }
    @Bean
    public ManagerRepo managerRepo(DB db){
        return new ManagerRepoImpl(JacksonDBCollection.wrap(db.getCollection("manager"),
                Manager.class,
                String.class,
                MONGO_JACK_MAPPER));
    }
    @Bean
    public ProjectRepo projectRepo(DB db){
        return new ProjectRepoImpl(JacksonDBCollection.wrap(db.getCollection("project"),
                Project.class,
                String.class,
                MONGO_JACK_MAPPER));
    }
}
