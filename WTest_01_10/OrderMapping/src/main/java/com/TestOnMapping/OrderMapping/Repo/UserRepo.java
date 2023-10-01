package com.TestOnMapping.OrderMapping.Repo;

import com.TestOnMapping.OrderMapping.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
