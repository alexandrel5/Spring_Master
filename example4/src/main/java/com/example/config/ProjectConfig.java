package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans to be used in the application.
 */


@Configuration
public class ProjectConfig {
    /*
    The method names usually follow verbs notation. But for methods which we will use to create beans, can
    use nouns as names. This will be a good practise as the method names will become
     bean names as well in the context.
     */
    @Bean(name = "audiVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean(value = "hondaVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    /*
    When you have multiple beans of the same kind inside the Spring context,
    you can make one of them primary by using @Primary annotation, Primary bean is the one which Spring will choose
    if it has multiple options and you don't specify a name.
    In other words, it is the default bean that Spring COntext will consider in case of
    confusion due to multiple beans present of same type.
     */
    @Primary
    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
