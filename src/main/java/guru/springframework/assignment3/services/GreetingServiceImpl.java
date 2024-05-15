package guru.springframework.assignment3.services;

import org.springframework.stereotype.Service;

@Service // this is a spring component now
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone form Base Service!!! ";
    }
}
