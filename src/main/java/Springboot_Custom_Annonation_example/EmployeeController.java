package Springboot_Custom_Annonation_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/test")
    public String testcase()
    {
        return "This is demo custom annotaion test case";
    }

    @PostMapping("/save")
    public String savedata(@RequestBody Employee employee)
    {
        employeeRepository.save(employee);
        return "data saved";
    }

    @GetMapping("/byid/{eid}")
    public Optional<Employee> ById(@PathVariable int eid)
    {
        return employeeRepository.findById(eid);
    }

    @GetMapping("/byname/{ename}")
    public Optional<Employee> ByName(@PathVariable String ename)
    {
        return employeeRepository.findByename(ename);
    }

    @PutMapping("/update/{eid}")
    public Employee update(@PathVariable int eid, @RequestBody Employee employee)
    {
        Employee employee1 = employeeRepository.findById(eid).get();
        employee1.setEname(employee.getEname());
        employee1.setAddress(employee.getAddress());
        employee1.setAge(employee.getAge());
        return employeeRepository.save(employee1);
    }
}
