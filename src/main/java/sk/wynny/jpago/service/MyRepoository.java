package sk.wynny.jpago.service;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.wynny.jpago.model.Employee;

public interface MyRepoository extends JpaRepository<Employee,Long> {

}
