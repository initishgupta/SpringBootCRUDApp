package com.luv2code.cruddemo.service;

import com.luv2code.cruddemo.dao.EmployeeDAO;
import com.luv2code.cruddemo.dao.EmployeeRepository;
import com.luv2code.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //EmployeeDAO won't be needed anymore because we are moving to Spring Data JPA from Spring JPA and EmployeeRepository Interface will automatically implement entire Data Layer
    //private EmployeeDAO employeeDAO;

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    //@Transactional - Removing for Spring Data JPA because spring Data JPA provides this functionality out of the box
    public List<Employee> findAll() {
        List<Employee> listOfEmployees = employeeRepository.findAll();
        return listOfEmployees;
    }

    @Override
    public Employee findById(int theId) {
       Optional<Employee> result = employeeRepository.findById(theId);

       Employee theEmployee = null;

       if(result.isPresent()){
           theEmployee = result.get();
       } else {
           throw new RuntimeException("Did not find employee id - " + theId);
       }

       return theEmployee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
