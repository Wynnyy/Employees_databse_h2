package sk.wynny.jpago.service;


import org.springframework.beans.factory.annotation.Autowired;
import sk.wynny.jpago.model.Employee;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service

public class MyService {
    @Autowired
    MyRepoository myRepoository;

    public void saveEmployee(){
//       Employee employee = new Employee();
//        employee.setName("Michal");
//        myRepoository.save(employee);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Michal","Hodul","CEO",10));
        employees.add(new Employee("Peter","Zeleny","brigadnik",44));
        employees.add(new Employee("Jozef","Tupak","brigadnik",25));
        employees.add(new Employee("Karol","Berol","brigadnik",11));
        employees.add(new Employee("Majka","Ajjtakova","upratovacka",21));
        employees.add(new Employee("Petra","Zlatokopkova","slapka",21));

        myRepoository.saveAll(employees);
        myRepoository.findAll();




    }


}
