package guru.springframework.assignment3.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone form Base Service!!! ";
    }
}
