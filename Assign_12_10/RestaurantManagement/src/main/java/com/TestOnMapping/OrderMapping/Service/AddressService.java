package com.TestOnMapping.OrderMapping.Service;

import com.TestOnMapping.OrderMapping.Model.Address;
import com.TestOnMapping.OrderMapping.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    public String saveAddress(Address address){
        addressRepo.save(address);
        return "Address saved";
    }
}
