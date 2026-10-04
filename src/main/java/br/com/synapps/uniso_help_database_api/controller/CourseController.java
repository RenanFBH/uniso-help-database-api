package br.com.synapps.uniso_help_database_api.controller;

import br.com.synapps.uniso_help_database_api.database.model.CourseEntity;
import br.com.synapps.uniso_help_database_api.service.CourseService;

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
@RequestMapping(path = "/v1/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CourseEntity> findAll() {
        return courseService.findAll();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CourseEntity findById(@PathVariable Integer id) {
        return courseService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Boolean createCourse(@RequestBody CourseEntity course) {
        return courseService.createCourse(course);
    }

    @PatchMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CourseEntity updateCourse(@PathVariable Integer id, @RequestBody CourseEntity course) {
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean deleteCourse(@PathVariable Integer id) {
        return courseService.deleteCourse(id);
    }

}
