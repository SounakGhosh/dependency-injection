package sounak.springframework.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sounak.springframework.di.controllers.*;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        System.out.println();

        I18nController i18nController = (I18nController) context.getBean("i18nController");

        System.out.println(i18nController.sayHello());
        System.out.println();

        System.out.println("--- Primary Bean ---");

        MyController myController = (MyController) context.getBean("myController");;

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

    }

}
