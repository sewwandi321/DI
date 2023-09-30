package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Alien {

    @Autowired
    private laptop lap;

    public laptop getLap() {
        return lap;
    }

    public void setLap(laptop lap) {
        this.lap = lap;
    }

    public Alien() {
        System.out.println("objected created");
    }

    public void show(){
        System.out.println("in show");
        lap.compile();

    }
}
