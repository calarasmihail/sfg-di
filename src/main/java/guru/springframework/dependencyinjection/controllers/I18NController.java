package guru.springframework.dependencyinjection.controllers;

import guru.springframework.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

  // --------------------------------------------------------------------------------------------

  // I18n is a common abbreviation for internationalization

  // Profiles are probably one of the most powerful features of the Spring Framework and probably
  // one of the most commonly used features of Dependency Injection inside Spring Framework

  // Profiles allow you to have beans in your configuration that will take on different
  // characteristics.

  // These profiles allow you to control your Spring application in different runtime environments.

  // Profile for MySql. In production you are controlling the MySql specific beans with a profile.

  // How profiles allow your Spring project to behave differently.

  // You can set a profile and then using inversion control container and Spring Framework it's
  // going to wire up your application differently depending on the active profiles.

  // --------------------------------------------------------------------------------------------

  // WE'LL HAVE THE CONTROLLER RETURN BACK TO DIFFERENT LANGUAGES DEPENDING ON THE PROFILE THAT
  // WE HAVE ACTIVE.

  private final GreetingService greetingService;

  // We add constructor so Spring will wire this up
  public I18NController(@Qualifier("i18nService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
