package com.company.controller;

import com.company.bootstrap.DataGenerator;
import com.company.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model){
      model.addAttribute("employee",new Employee());
      model.addAttribute("states", DataGenerator.getAllStates());
        return "/employee/employee-create";
    }

    @PostMapping("/list")
    public String getEmployeeList(@ModelAttribute("employee") Employee employee, Model model){

        DataGenerator.saveEmployee(employee);

        model.addAttribute("employeeList",DataGenerator.readAllEmployees());


        return "/employee/employee-list";
    }

}
