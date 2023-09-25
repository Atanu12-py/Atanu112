package com.User.UserMgmntSys.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserSys")
public class User {
    @Id
    @NotNull
    private Integer userId;
    private String userName;
//    private LocalDate DOB;
    @Email
    private String emailId;
    @Size(min = 12,max = 12)
    @Pattern(regexp = "^[0-9]+$",message = "PhoneNo should be number..!")
    private String phoneNo;
//    private Date date;
//    private Time time;
}
