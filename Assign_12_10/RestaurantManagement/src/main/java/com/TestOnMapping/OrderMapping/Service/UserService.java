package com.TestOnMapping.OrderMapping.Service;

import com.TestOnMapping.OrderMapping.Model.User;
import com.TestOnMapping.OrderMapping.Repo.OrderRepo;
import com.TestOnMapping.OrderMapping.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String saveUser(User user){
        userRepo.save(user);
        return "User added";
    }
    public User getUderid(Integer id){
        return userRepo.findById(id).get();
    }
}
