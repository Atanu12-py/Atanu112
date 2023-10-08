package com.WTest.Student.Controller;

import com.WTest.Student.Model.Address;
import com.WTest.Student.Service.Addressservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Addresscontrol {
    @Autowired
    Addressservice addressservice;

    @PostMapping("address")
    public Address saveaddress(@RequestBody Address address){
        return addressservice.createAddress(address);
    }

    @GetMapping("address")
    public List<Address> getalladdress(){
        return addressservice.getAllAddresses();
    }
}
