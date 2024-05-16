package guru.springframework.assignment3.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("Environment")
public class EnvironmentServiceQA implements EnvironmentService {

    @Override
    public String getEnv() {
        return "QA";
    }
}
