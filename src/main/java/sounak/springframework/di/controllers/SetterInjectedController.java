package sounak.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sounak.springframework.di.services.GreetingService;

/**
 * Created by sounak on 24-06-2024.
 */
@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
