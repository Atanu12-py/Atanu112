package com.WTest.Student.Repo;

import com.WTest.Student.Model.Address;
import com.WTest.Student.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressrepo extends JpaRepository<Address,Integer> {
}
