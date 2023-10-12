package com.TestOnMapping.OrderMapping.Controller;

import com.TestOnMapping.OrderMapping.Model.User;
import com.TestOnMapping.OrderMapping.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("user")
    public String saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("user/id/{id}")
    public User getUderid(@PathVariable Integer id){
        return userService.getUderid(id);
    }
}
