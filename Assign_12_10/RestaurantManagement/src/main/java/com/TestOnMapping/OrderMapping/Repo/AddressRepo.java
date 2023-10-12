package com.TestOnMapping.OrderMapping.Repo;

import com.TestOnMapping.OrderMapping.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepo extends JpaRepository<Address,Integer> {

}
