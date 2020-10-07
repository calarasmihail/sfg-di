package guru.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - From The PRIMARY Bean";
  }

  // IN LESSON 37 WE PROVIDED ANOTHER INSTANCE OF THE GREETING SERVICE THAT IMPLEMENTS
  // THE GREETING SERVICE INTERFACE, ANNOTATED IS AS A SPRING SERVICE SO THAT BRINGS
  // THAT UP AS A SPRING COMPONENT AND THEN WE MARKED IT AS PRIMARY.

}
