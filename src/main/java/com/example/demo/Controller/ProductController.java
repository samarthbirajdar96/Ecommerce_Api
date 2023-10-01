package com.example.demo.Controller;

import com.example.demo.Model.Product;
import com.example.demo.Repo.ProductRepo;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @PostMapping("product")

    public String addproduct(@RequestBody Product product){
        return productService.addproduct(product);
    }

    @GetMapping("products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("product/category/{category}")
    public List<Product> getproductbycategory(@PathVariable String category){
        return productService.getproductbycategory(category);
    }

    @DeleteMapping("product/id/{id}")
    public String removeproductbyid(@PathVariable Integer id){
        return productService.removeproductbyid(id);
    }
}
