package guru.springframework.assignment3.controllers;

import guru.springframework.assignment3.services.GreetingService;
import org.springframework.stereotype.Controller;

// best practice
@Controller // spring managed component
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
