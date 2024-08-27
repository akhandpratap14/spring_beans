package com.Beans.Beans.controllers;

import com.Beans.Beans.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @GetMapping(path = "/getSecretMessage")
    public String getMySecretMessage(){
        return "Secret: Abracadabra";
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return new EmployeeDTO(id, "Akhand", "akhand@gmail.com", 23, true, LocalDate.of(2023, 9, 15));
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) String name, @RequestParam(required = false) String age){
        return "Hii " + name + " your age is " + age;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeDTO.setId(2L);
        return employeeDTO;
    }

    @PutMapping String updateEmployeeById(){
        return "employeeDTO";
    }

}
