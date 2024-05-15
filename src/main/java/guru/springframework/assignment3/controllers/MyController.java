package guru.springframework.assignment3.controllers;

import guru.springframework.assignment3.services.GreetingService;
import guru.springframework.assignment3.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am in the controller");

        return greetingService.sayGreeting();
    }
}
