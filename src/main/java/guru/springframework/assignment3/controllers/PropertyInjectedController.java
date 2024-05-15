package guru.springframework.assignment3.controllers;

import guru.springframework.assignment3.services.GreetingService;

// least preferred
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
