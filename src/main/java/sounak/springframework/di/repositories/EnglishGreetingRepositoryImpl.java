package sounak.springframework.di.repositories;

/**
 * Created by sounak on 03-07-2024.
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
