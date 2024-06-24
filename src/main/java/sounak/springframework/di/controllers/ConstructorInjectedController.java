package sounak.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sounak.springframework.di.services.GreetingService;

/**
 * Created by sounak on 24-06-2024.
 */
@Controller
public class ConstructorInjectedController {

    // Autowiring not required.
    // As of Spring 4.3, classes with a single constructor can omit the @Autowired annotation.
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
