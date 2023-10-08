package com.WTest.Student.Service;

import com.WTest.Student.Model.Course;
import com.WTest.Student.Repo.ICourserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Courseservice {

    @Autowired
    ICourserepo iCourserepo;
    public Course createCourse(Course course) {
        return iCourserepo.save(course);
    }

    public List<Course> getAllCourses() {
        return iCourserepo.findAll();
    }

    public Course getCourseById(Integer id) {
        return iCourserepo.findById(id).get();
    }

//    public void updateCourse(String id, Course updatedCourse) {
//        // Implement update logic
//    }

    public void deleteCourse(Integer id) {
        iCourserepo.deleteById(id);
    }
}
