package com.Beans.Beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    void eatApple(){
        System.out.println("I am eating Apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsCreated(){
        System.out.println("Apple Creating before use...Yay!!!");
    }

    @PreDestroy
    void callThisBeforeAppleIsDestroyed(){
        System.out.println("Apple Destroyed!!!");
    }
}
