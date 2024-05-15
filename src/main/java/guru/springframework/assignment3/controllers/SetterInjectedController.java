package guru.springframework.assignment3.controllers;

import guru.springframework.assignment3.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // spring managed component
public class SetterInjectedController {

    private GreetingService greetingService;


    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingBean")GreetingService greetingService) {
        System.out.println("Setter called");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
