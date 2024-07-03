package sounak.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sounak.springframework.di.services.ConstructorInjectedGreetingService;
import sounak.springframework.di.services.PropertyInjectedGreetingService;
import sounak.springframework.di.services.SetterInjectedGreetingService;

/**
 * Created by sounak on 03-07-2024.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
}
