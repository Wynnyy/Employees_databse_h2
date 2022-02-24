package sk.wynny.jpago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.wynny.jpago.service.MyRepoository;
import sk.wynny.jpago.service.MyService;

import java.security.Provider;

@Component
public class AppRun {
    @Autowired
    MyService myService;

    public void run(){
        myService.saveEmployee();


    }

}
