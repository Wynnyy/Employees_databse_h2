package sk.wynny.jpago.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.wynny.jpago.model.Employee;
@Repository
public interface MyRepoository extends JpaRepository<Employee,Long> {

}
