package br.com.synapps.uniso_help_database_api.service;

import br.com.synapps.uniso_help_database_api.database.model.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<EmployeeEntity> employees = new ArrayList<>(List.of(
            new EmployeeEntity(1, "teste1", "teste1"),
            new EmployeeEntity(2, "teste2", "teste2"),
            new EmployeeEntity(3, "teste3", "teste3")
    ));

    public List<EmployeeEntity> findAll() {
        return employees;
    }

    public EmployeeEntity findById(Integer id) {
        for (EmployeeEntity employee: employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public Boolean createEmployee(EmployeeEntity employee) {
        return employees.add(employee);
    }

    public EmployeeEntity updateEmployee(Integer id, EmployeeEntity newEmployee) {
        for (EmployeeEntity oldEmployee: employees) {
            if (oldEmployee.getId().equals(id)) {
                oldEmployee.setName(newEmployee.getName());
                oldEmployee.setPosition(newEmployee.getPosition());
                return oldEmployee;
            }
        }
        return null;
    }

    public Boolean deleteEmployee(Integer id) {
        for (EmployeeEntity employee: employees) {
            if (employee.getId().equals(id)) {
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }


}
