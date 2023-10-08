package com.WTest.Student.Controller;

import com.WTest.Student.Model.Course;
import com.WTest.Student.Service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Coursecontrol {
    @Autowired
    Courseservice courseservice;

    @PostMapping("course")
    public Course savecourse(@RequestBody Course course){
        return courseservice.createCourse(course);
    }

    @GetMapping("course")
    public List<Course> getallcourse(){
        return courseservice.getAllCourses();
    }
}
