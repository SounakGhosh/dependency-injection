package sounak.springframework.di.controllers;

import org.springframework.stereotype.Controller;
import sounak.springframework.di.services.GreetingService;

/**
 * Created by sounak on 23-06-2024.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
