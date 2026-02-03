package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
Spring @Configuration annotation is part of spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans to be used in the application.
 */


@Configuration
@ComponentScan(basePackages = {"com.example.implementation", "com.example.services", "com.example.aspects"})
//@ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class, com.example.beans.Vehicle.class})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
