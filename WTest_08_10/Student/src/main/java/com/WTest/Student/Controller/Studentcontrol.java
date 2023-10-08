package com.WTest.Student.Controller;

import com.WTest.Student.Model.Student;
import com.WTest.Student.Service.Courseservice;
import com.WTest.Student.Service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studentcontrol {
    @Autowired
    Studentservice studentservice;
    @PostMapping("student")
    public Student saveStudent(@RequestBody Student student){
        return studentservice.createStudent(student);
    }

    @GetMapping("student")
    public List<Student> getstudent(){
        return studentservice.getAllStudents();
    }

    @GetMapping("student/id/{id}")
    public Student getstudentid(@PathVariable Integer id){
        return studentservice.getStudentById(id);
    }

    @DeleteMapping("student/id/{id}")
    public void deletestudent(@PathVariable Integer id){
        studentservice.deleteStudent(id);
    }
}
