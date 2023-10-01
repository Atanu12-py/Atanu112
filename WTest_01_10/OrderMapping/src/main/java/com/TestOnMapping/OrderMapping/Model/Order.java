package com.TestOnMapping.OrderMapping.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer productQuantity;

    @ManyToOne
    @JoinColumn(name = "fk_userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "fk_Id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "fk_addId")
    private Address address;
}
