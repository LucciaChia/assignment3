package guru.springframework.assignment3.controllers;

import guru.springframework.assignment3.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnv() {
        return environmentService.getEnv();
    }
}
