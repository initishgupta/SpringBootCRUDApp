package com.luv2code.cruddemo.service;

import com.luv2code.cruddemo.dao.EmployeeDAO;
import com.luv2code.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        List<Employee> listOfEmployees = employeeDAO.findAll();
        return listOfEmployees;
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
       Employee employee = employeeDAO.findById(theId);
       return employee;
    }

    @Override
    @Transactional
    public void save(Employee employee) {
       employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
       employeeDAO.deleteById(theId);
    }
}
