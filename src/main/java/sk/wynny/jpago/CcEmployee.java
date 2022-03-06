package sk.wynny.jpago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sk.wynny.jpago.model.Employee;
import sk.wynny.jpago.service.MyRepoository;
import sk.wynny.jpago.service.MyService;

import java.util.List;

@Controller
public class CcEmployee {
    @Autowired
    MyService myService;
    MyRepoository myRepoository;


//    @RequestMapping("/employee")
//    public String getEmployee(Model model){
//        model.addAttribute("employee",myRepoository.findAll());
//        return "employee";
//    }
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Employee> employeeList = myRepoository.findAll();
        model.addAttribute("employeeList", employeeList);
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("employee", new Employee());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)

    public String saveStudent(@ModelAttribute("employee") Employee std) {
        myService.save(std);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Employee std = myService.get(id);
        mav.addObject("employee", std);
        return mav;

    }
    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id) {
        myService.delete(id);
        return "redirect:/";
    }

}
