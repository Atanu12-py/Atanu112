package com.WTest.Student.Service;

import com.WTest.Student.Model.Address;
import com.WTest.Student.Repo.IAddressrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Addressservice {
    @Autowired
    IAddressrepo iAddressrepo;

    public Address createAddress(Address address) {
        return iAddressrepo.save(address);
    }

    public List<Address> getAllAddresses() {
        return iAddressrepo.findAll();
    }

    public Address getAddressById(Integer id) {
        return iAddressrepo.findById(id).get();
    }

    public void updateAddress(Long id, Address updatedAddress) {
        // Implement update logic
    }

    public void deleteAddress(Integer id) {
        iAddressrepo.deleteById(id);
    }
}
