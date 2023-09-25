package com.User.UserMgmntSys.Service;

import com.User.UserMgmntSys.Model.User;
import com.User.UserMgmntSys.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String addUser(User newUser){
        userRepo.save(newUser);
        return "User added";
    }
//    public List<User> getUser(Integer id){
//        return userRepo.findByUserId(id);
//    }
    public User getUser(Integer id){
        return userRepo.findById(id).get();
    }

    public List<User> getAllUser(){
        return (List<User>) userRepo.findAll();
    }
    public String updateUser(String email,String phNo,Integer id){
        userRepo.updateUserByIdSetEmailIdPhoneNo(email,phNo,id);
        return "User info updated";
    }

    public String deleteUser(Integer id){
        userRepo.deleteById(id);
        return "User id "+id+" deleted";
    }
}
