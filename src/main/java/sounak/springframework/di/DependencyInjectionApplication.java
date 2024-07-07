package sounak.springframework.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sounak.springframework.di.config.DiConfiguration;
import sounak.springframework.di.controllers.*;
import sounak.springframework.di.datasource.FakeDataSource;
import sounak.springframework.di.services.PrototypeBean;
import sounak.springframework.di.services.SingletonBean;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        System.out.println();

        PetController petController = context.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());
        System.out.println();

        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());
        System.out.println();

        System.out.println("--- Primary Bean ---");
        MyController myController = (MyController) context.getBean("myController");
        System.out.println(myController.sayHello());
        System.out.println();

        System.out.println("--- Property Injection ---");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println();

        System.out.println("--- Setter Injection ---");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println();

        System.out.println("--- Constructor Injection ---");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
        System.out.println();

        System.out.println("--- Bean Scopes ---");
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());
        System.out.println();

        System.out.println("--- External Properties ---");
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getJdbcurl());
        System.out.println();

        System.out.println("--- Properties Binding ---");
        DiConfiguration diConfiguration = context.getBean(DiConfiguration.class);
        System.out.println(diConfiguration.getUsername());
        System.out.println(diConfiguration.getPassword());
        System.out.println(diConfiguration.getJdbcurl());
        System.out.println();
    }
}
