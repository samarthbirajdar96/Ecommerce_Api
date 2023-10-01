package com.example.demo.Service;

import com.example.demo.Model.Order;
import com.example.demo.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    public String addorder(Order order) {
        orderRepo.save(order);
        return "added";
    }

    public Order getallorders(Integer id) {
        return orderRepo.findById(id).orElseThrow();
    }

}
