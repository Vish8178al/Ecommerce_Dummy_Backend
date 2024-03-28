package com.vishal.springbootdemo.service;

import com.vishal.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    List<Employee> employees=new ArrayList<>();
    @Override
    public Employee save(Employee employee){
        if(employee.getEmailId().isEmpty() || employee.getId()==null){
            employee.setId(UUID.randomUUID().toString());
        }
        employees.add(employee);
    return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.
                stream()
                .filter(employee -> employee.getId().equalsIgnoreCase(id))
                .findFirst().get();
    }

    @Override
    public String deleteEmployeeById(String id) {

        Employee employee=employees.stream()
                .filter(e ->e.getId().equalsIgnoreCase(id) )
                .findFirst()
                .get();
        employees.remove(employee);
        return "Employee Deleted Successfully with: "+id;
    }

}
