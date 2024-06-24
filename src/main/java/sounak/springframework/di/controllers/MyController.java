package sounak.springframework.di.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by sounak on 23-06-2024.
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!!!");
        return "Hi Folks!";
    }
}
