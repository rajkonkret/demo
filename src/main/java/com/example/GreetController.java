package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/greet")
public class GreetController {

    @Inject
    GreetingService greetingService;

    @Get("/")
    public String hallo(){
        return "Must send name";
    }

    @Get(value = "/{name}", produces = MediaType.TEXT_PLAIN)
    public String greet(String name){
        return greetingService.getGreeting() + name;
    }
}
