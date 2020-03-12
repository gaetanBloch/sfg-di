package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController implements InjectedController{

    @Qualifier("propertyGettingService")
    @Autowired
    public GreetingService greetingService;

    @Override
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
