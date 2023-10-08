package com.WTest.Student.Service;

import com.WTest.Student.Model.Laptop;
import com.WTest.Student.Repo.ILaptoprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Laptopservice {

    @Autowired
    private ILaptoprepo iLaptoprepo;

    public Laptop createLaptop(Laptop laptop) {
        return iLaptoprepo.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return iLaptoprepo.findAll();
    }

    public Laptop getLaptopById(Integer id) {
        return iLaptoprepo.findById(id).get();
    }

//    public void updateLaptop(String id, Laptop updatedLaptop) {
//        // Implement update logic
//    }

    public void deleteLaptop(Integer id) {
        iLaptoprepo.deleteById(id);
    }
}
