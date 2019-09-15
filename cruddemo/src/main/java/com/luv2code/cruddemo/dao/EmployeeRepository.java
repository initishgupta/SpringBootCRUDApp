package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// TO setup a different endpoint
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //SPRING DATA JPA IMPLEMENTATION This is empty because all implementations for DAO or DAO interface is already handled by Spring so no need to write any code
}
