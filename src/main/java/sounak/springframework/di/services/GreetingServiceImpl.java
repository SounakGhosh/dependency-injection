package sounak.springframework.di.services;

import org.springframework.stereotype.Service;

/**
 * Created by sounak on 24-06-2024.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
