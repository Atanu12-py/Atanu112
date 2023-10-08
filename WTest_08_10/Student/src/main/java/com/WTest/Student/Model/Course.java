package com.WTest.Student.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    private Integer ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany(mappedBy = "courseSet")
    private Set<Student> studentSet;
}
