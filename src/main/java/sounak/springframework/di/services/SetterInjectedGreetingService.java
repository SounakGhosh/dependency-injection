package sounak.springframework.di.services;

/**
 * Created by sounak on 24-06-2024.
 */
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
