package guru.springframework.assignment3.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("Environment")
public class EnvironmentServiceDev implements EnvironmentService {

    @Override
    public String getEnv() {
        return "Dev";
    }
}
