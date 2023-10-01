package com.TestOnMapping.OrderMapping.Controller;

import com.TestOnMapping.OrderMapping.Model.Address;
import com.TestOnMapping.OrderMapping.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String saveAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }
}
