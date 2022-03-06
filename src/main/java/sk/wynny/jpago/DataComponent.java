package sk.wynny.jpago;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sk.wynny.jpago.service.MyService;

@Component
@Deprecated
public class DataComponent implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    MyService myService;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        myService.saveEmployee();
//        myService.saveEmployee();


    }


}
