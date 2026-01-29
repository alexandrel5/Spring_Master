package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    public Person(@Qualifier("vehicle2") Vehicle vehicle){
        System.out.print("Person bean created by Spring");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private String name = "Lucy";

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
     is used to auto-wire the beans that is
    'injecting beans' (Objects) at runtime by Spring Dependency Injection mechanism
     */
    private Vehicle vehicle;
}
