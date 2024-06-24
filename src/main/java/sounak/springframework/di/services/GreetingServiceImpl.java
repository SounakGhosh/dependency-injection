package sounak.springframework.di.services;

/**
 * Created by sounak on 24-06-2024.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
