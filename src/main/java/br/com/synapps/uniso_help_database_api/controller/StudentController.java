package br.com.synapps.uniso_help_database_api.controller;

import br.com.synapps.uniso_help_database_api.database.model.StudentEntity;
import br.com.synapps.uniso_help_database_api.service.StudentService;

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
@RequestMapping("/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentEntity> findAll() {
        return studentService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentEntity findById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean createStudent(@RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    @PatchMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentEntity updateStudent(@PathVariable Integer id, @RequestBody StudentEntity student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteStudent(@PathVariable Integer id) {
        return studentService.deleteStudent(id);
    }

}
