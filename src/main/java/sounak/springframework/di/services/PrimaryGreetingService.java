package sounak.springframework.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by sounak on 25-06-2024.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY";
    }
}
