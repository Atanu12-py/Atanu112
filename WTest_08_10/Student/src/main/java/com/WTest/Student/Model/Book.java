package com.WTest.Student.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private Integer ID;
    private String title;
    private String author;
    private String description;
    private Integer price;

    @ManyToOne
    private Student student;
}
