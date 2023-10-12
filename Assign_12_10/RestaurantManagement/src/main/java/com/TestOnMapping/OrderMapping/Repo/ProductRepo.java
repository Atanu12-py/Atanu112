package com.TestOnMapping.OrderMapping.Repo;

import com.TestOnMapping.OrderMapping.Model.Product;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findAllByCategory(String category);
}
