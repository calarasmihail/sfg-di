package guru.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hola Mundo - SPANISH";
  }
}