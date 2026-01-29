package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void printHello(){
        System.out.println(
                "Printing hello from Component Vehicle Bean"
        );
    }
}
