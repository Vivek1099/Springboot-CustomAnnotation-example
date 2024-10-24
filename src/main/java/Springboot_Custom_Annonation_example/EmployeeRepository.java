package Springboot_Custom_Annonation_example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> 
{
    Optional<Employee> findByename(String ename);
}
