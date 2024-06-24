package sounak.springframework.di.controllers;

import sounak.springframework.di.services.GreetingService;

/**
 * Created by sounak on 24-06-2024.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
