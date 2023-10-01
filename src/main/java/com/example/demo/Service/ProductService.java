package com.example.demo.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public String addproduct(Product product) {

        productRepo.save(product);
        return "added";
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public List<Product> getproductbycategory(String category) {
        return productRepo.findByProductCategory(category);
    }


    public String removeproductbyid(Integer id) {
        productRepo.deleteById(id);
        return "deleted";
    }
}
