package guru.springframework.dependencyinjection;

import guru.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import guru.springframework.dependencyinjection.controllers.MyController;
import guru.springframework.dependencyinjection.controllers.PropertyInjectedController;
import guru.springframework.dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------- Primary Bean ----------");
        System.out.println(myController.sayHello());

        System.out.println("----- Property ------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)
                ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------- SETTER INJECTED CONTROLLER --------");
        SetterInjectedController setterInjectedController = (SetterInjectedController)
                ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ CONSTRUCTOR INJECTED CONTROLLER --------");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)
                ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

    //todo How Primary and Qualifier can work together and controlling how classes get
    // injected into your Spring managed components

}
