package br.com.synapps.uniso_help_database_api.service;

import br.com.synapps.uniso_help_database_api.database.model.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private static final List<StudentEntity> students = new ArrayList<>(List.of(
            new StudentEntity(1, 1, "teste1", "teste1"),
            new StudentEntity(2, 2, "teste2", "teste3"),
            new StudentEntity(3, 3, "teste3", "teste3")
    ));

    public List<StudentEntity> findAll() {
        return students;
    }

    public StudentEntity findById(Integer id) {
        for (StudentEntity student: students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public Boolean createStudent(StudentEntity student) {
        return students.add(student);
    }

    public StudentEntity updateStudent(Integer id, StudentEntity updatedStudent) {
        for (StudentEntity oldStudent: students) {
            if (oldStudent.getId().equals(id)) {
                oldStudent.setRa(updatedStudent.getRa());
                oldStudent.setPassword(updatedStudent.getPassword());
                oldStudent.setName(updatedStudent.getName());
                return oldStudent;
            }
        }
        return null;
    }

    public boolean deleteStudent(Integer id) {
        for (StudentEntity student: students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

}
