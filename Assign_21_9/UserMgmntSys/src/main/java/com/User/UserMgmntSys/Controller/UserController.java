package com.User.UserMgmntSys.Controller;

import com.User.UserMgmntSys.Model.User;
import com.User.UserMgmntSys.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("User")
    public String addUser(@RequestBody User newUser){
        return userService.addUser(newUser);
    }

    @GetMapping("User/id/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @GetMapping("Users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("User/email/{email},phNo/{phNo}/id/{id}")
    public String updateUser(@PathVariable String email,String phNo,Integer id){
        return userService.updateUser(email,phNo,id);
    }

    @DeleteMapping("User/id/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}
