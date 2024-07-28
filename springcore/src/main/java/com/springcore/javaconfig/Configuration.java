package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Samosa getSamosa() {
        return new Samosa();
    }

    @Bean(name = {"eshan", "subhash", "shende"})
    public Student getStudent() {
        return new Student();
    }
}
