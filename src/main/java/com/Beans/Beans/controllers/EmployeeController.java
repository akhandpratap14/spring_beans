package com.Beans.Beans.controllers;

import com.Beans.Beans.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    @GetMapping(path = "/getSecretMessage")
    public String getMySecretMessage(){
        return "Secret: Abracadabra";
    }

    @GetMapping(path = "/getEmployee/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId, "Akhand", "akhand@gmail.com", 23, true, LocalDate.of(2023, 9, 15));
    }

    @GetMapping(path = "/employees")
    public String getAllEmployees(@RequestParam String name){
        return "Hii " + name + "!";
    }

}
