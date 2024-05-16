package guru.springframework.assignment3.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("Environment")
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String getEnv() {
        return "Uat";
    }
}
