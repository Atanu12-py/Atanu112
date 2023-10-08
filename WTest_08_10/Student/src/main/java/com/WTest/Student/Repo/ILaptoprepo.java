package com.WTest.Student.Repo;

import com.WTest.Student.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptoprepo extends JpaRepository<Laptop,Integer> {
}
