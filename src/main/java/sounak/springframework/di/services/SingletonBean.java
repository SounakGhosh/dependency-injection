package sounak.springframework.di.services;

import org.springframework.stereotype.Component;

/**
 * Created by sounak on 05-07-2024.
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
