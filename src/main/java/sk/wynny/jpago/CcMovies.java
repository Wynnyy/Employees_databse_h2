package sk.wynny.jpago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.wynny.jpago.service.MyRepoository;
import sk.wynny.jpago.service.MyService;

@Controller
public class CcMovies {
    @Autowired
    MyRepoository myRepoository;

    @RequestMapping("/employee")
    public String getEmployee(Model model){
        model.addAttribute("employee",myRepoository.findAll());
        return "employee";
    }
}
