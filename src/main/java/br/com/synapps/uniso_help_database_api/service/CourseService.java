package br.com.synapps.uniso_help_database_api.service;
import br.com.synapps.uniso_help_database_api.database.model.CourseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private List<CourseEntity> courses = new ArrayList<>(List.of(
            new CourseEntity(1, "a", "a"),
            new CourseEntity(2, "a", "a"),
            new CourseEntity(3, "a", "a")
    ));

    public List<CourseEntity> findAll() {
        return courses;
    }

    public CourseEntity findById(Integer id) {
        for (CourseEntity course: courses) {
            if (course.getId().equals(id)){
                return course;
            }
        }
        return null;
    }

    public Boolean createCourse(CourseEntity course) {
        return courses.add(course);
    }

    public CourseEntity updateCourse(Integer id, CourseEntity newCourse) {
        for (CourseEntity oldCourse: courses) {
            if (oldCourse.getId().equals(id)) {
                oldCourse.setName(newCourse.getName());
                oldCourse.setDescription(newCourse.getDescription());
                return oldCourse;
            }
        }
        return null;
    }

    public Boolean deleteCourse(Integer id) {
        for (CourseEntity course: courses) {
            if (course.getId().equals(id)) {
                courses.remove(course);
                return true;
            }
        }
        return false;
    }

}
