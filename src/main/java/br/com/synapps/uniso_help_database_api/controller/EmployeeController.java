package br.com.synapps.uniso_help_database_api.controller;

import br.com.synapps.uniso_help_database_api.database.model.EmployeeEntity;
import br.com.synapps.uniso_help_database_api.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeEntity> findAll() {
        return employeeService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeEntity findById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }

    @PatchMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeEntity updateEmployee(@PathVariable Integer id, @RequestBody EmployeeEntity employee) {
        return employeeService.updateEmployee(id,  employee);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean deleteEmployee(@PathVariable Integer id) {
        return employeeService.deleteEmployee(id);
    }

}
