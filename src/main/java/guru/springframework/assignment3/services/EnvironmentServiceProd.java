package guru.springframework.assignment3.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("Environment")
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnv() {
        return "Prod";
    }
}
