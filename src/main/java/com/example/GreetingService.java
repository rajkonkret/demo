package com.example;

import jakarta.inject.Singleton;

@Singleton
public class GreetingService {

    String getGreeting(){
        return "Hello ";
    }
}
