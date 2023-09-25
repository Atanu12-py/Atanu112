package com.User.UserMgmntSys.Repo;

import com.User.UserMgmntSys.Model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {
    List<User> findByUserId(Integer id);

    @Modifying
    @Query(value = "UPDATE USER_SYS SET EMAIL=:email,PHONE_NO=:phNo WHERE ID=:id",nativeQuery = true)
    void updateUserByIdSetEmailIdPhoneNo(String email,String phNo,Integer id);
}
