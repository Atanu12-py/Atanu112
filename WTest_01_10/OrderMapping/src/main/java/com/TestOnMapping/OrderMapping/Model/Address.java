package com.TestOnMapping.OrderMapping.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String name;
    private String landmark;
    private String phoneNo;
    private String zipcode;
    private String state;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
