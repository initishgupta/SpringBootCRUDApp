//Commenting Out Entire Code because default endpoints and Controller will be made by Spring DATA Rest API

//package com.luv2code.cruddemo.rest;
//
//import com.luv2code.cruddemo.dao.EmployeeDAO;
//import com.luv2code.cruddemo.entity.Employee;
//import com.luv2code.cruddemo.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {
//
////    private EmployeeDAO employeeDAO;
////    // quick and dirty: inject employe dao
//
//    //commented above code because it's not a great way to call DAO directly. You should use service layer to perform the operation from Controller
//
//    private EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeRestController(EmployeeService theEmployeeService) {
//        employeeService = theEmployeeService;
//    }
//
//    //expose "/employees" and return list of employees
//    @GetMapping("/employees")
//    public List<Employee> findAll() {
//        return employeeService.findAll();
//    }
//
//
//    //add mapping for GET /employee/{employeeId}
//
//    @GetMapping("/employees/{employeeId}")
//    public Employee getEmployee(@PathVariable int employeeId ) {
//
//        Employee employee = employeeService.findById(employeeId);
//        if(employee == null) {
//            throw new RuntimeException("Employee ID not Found -" + employeeId);
//        }
//        return employee;
//
//    }
//
//    //add mapping for GET /employee/{employeeId}
//
//    @PostMapping("/employees")
//    public Employee addEmployee(@RequestBody Employee theEmployee ) {
//
//       // also just in case they pass an id in jSON set id to )
//        //this is to force a save of new item instead of update
//
//        theEmployee.setId(0);
//        employeeService.save(theEmployee);
//        return theEmployee;
//
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee theEmployee ) {
//
//        // also just in case they pass an id in jSON set id to )
//        //this is to force a save of new item instead of update
//        employeeService.save(theEmployee);
//        return theEmployee;
//    }
//
//    @DeleteMapping("/employees/{employeeId}")
//    public String deleteEmployee(@PathVariable int employeeId ) {
//
//        // also just in case they pass an id in jSON set id to )
//        //this is to force a save of new item instead of update
//        Employee employee = employeeService.findById(employeeId);
//        if(employee == null) {
//            throw new RuntimeException("Employee id not found - " + employeeId);
//        }
//
//        employeeService.deleteById(employeeId);
//        return "Deleted employee id - " + employeeId;
//    }
//
//}
