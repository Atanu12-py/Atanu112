package com.WTest.Student.Controller;

import com.WTest.Student.Model.Laptop;
import com.WTest.Student.Service.Laptopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Laptopcontrol {
    @Autowired
    Laptopservice laptopservice;

    @PostMapping("laptop")
    public Laptop savelaptop(@RequestBody Laptop laptop){
        return laptopservice.createLaptop(laptop);
    }

    @GetMapping("laptop")
    public List<Laptop> getalllaptop(){
        return laptopservice.getAllLaptops();
    }
}
