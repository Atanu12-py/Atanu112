package com.WTest.Student.Service;

import com.WTest.Student.Model.Student;
import com.WTest.Student.Repo.IStudentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Studentservice {
    @Autowired
    IStudentrepo iStudentrepo;
    public Student createStudent(Student student) {
        return iStudentrepo.save(student);
    }

    public List<Student> getAllStudents() {
        return iStudentrepo.findAll();
    }

    public Student getStudentById(Integer id) {
        return iStudentrepo.findById(id).get();
    }

//    public void updateStudent(Integer id, Student updatedStudent) {
//        // Implement update logic
//    }

    public void deleteStudent(Integer id) {
        iStudentrepo.deleteById(id);
    }
}
