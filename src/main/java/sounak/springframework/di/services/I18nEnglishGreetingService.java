package sounak.springframework.di.services;

/**
 * Created by sounak on 25-06-2024.
 */
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
