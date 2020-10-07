package guru.springframework.dependencyinjection.controllers;

import guru.springframework.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(
        GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }

    // IN LESSON 37 WE ADDED IN THE PROPERTY FOR THE GREETING SERVICE. ADDED ON THE
    // CONSTRUCTOR. NO NEED FOR AUTOWIRE AND ALSO NO NEED FOR THE QUALIFIER.
    // SO REMEMBER ON THE CONSTRUCTOR INJECTED CONTROLLER WE ADDED IN THIS QUALIFIER:
    // @Qualifier("constructorGreetingService"). DELETE THIS QUALIFIER AND RUN AGAIN.
    // YOU WILL SEE THAT WE'LL GET THE PRIMARY BEAN INJECTED INTO THE CONSTRUCTOR
    // INJECTED CONTROLLER AS WELL. FROM:
    // Hello World - constructor
    // IT TRANSFORMS IN: Hello World - From The PRIMARY Bean



}
