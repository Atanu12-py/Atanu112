package com.TestOnMapping.OrderMapping.Service;

import com.TestOnMapping.OrderMapping.Model.Product;
import com.TestOnMapping.OrderMapping.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.Authenticator;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public String saveProduct(Product product){
        productRepo.save(product);
        return "Product added";
    }

    public List<Product> getProductCategory(String category){

        return productRepo.findAllByCategory(category);
    }

    public String deleteProduct(Integer id){
        productRepo.deleteById(id);
        return "product deleted";
    }

}
