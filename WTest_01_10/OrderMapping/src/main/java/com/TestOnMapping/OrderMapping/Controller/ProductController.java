package com.TestOnMapping.OrderMapping.Controller;

import com.TestOnMapping.OrderMapping.Model.Product;
import com.TestOnMapping.OrderMapping.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String saveOrder(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @GetMapping("product/category/{category}")
    public List<Product> getProductCategory(@PathVariable String category){
        return productService.getProductCategory(category);
    }

    @DeleteMapping("product/id/{id}")
    public String deleteProduct(@PathVariable Integer id){
        return productService.deleteProduct(id);
    }
}
