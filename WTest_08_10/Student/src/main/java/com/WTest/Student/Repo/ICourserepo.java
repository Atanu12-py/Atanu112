package com.WTest.Student.Repo;

import com.WTest.Student.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourserepo extends JpaRepository<Course,Integer> {
}
