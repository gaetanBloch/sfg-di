package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController implements InjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGettingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
