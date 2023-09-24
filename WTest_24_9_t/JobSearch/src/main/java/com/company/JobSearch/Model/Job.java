package com.company.JobSearch.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JobPortal")
public class Job {
    @Id
    private Long id;
    private String title;
    private String description;
    private String location;
    @Min(20000)
    private Double salary;
    private String companyEmail;

    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private Type jobType;
    private LocalDate appliedDate;

}
