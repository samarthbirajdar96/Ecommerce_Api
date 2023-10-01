package com.example.demo.Controller;

import com.example.demo.Model.Order;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

      @PostMapping("order")
    public String addorder(@RequestBody Order order){
         return orderService.addorder(order);
      }

      @GetMapping("orders/id/{id}")
    public Order getallorders(@PathVariable Integer id){
          return  orderService.getallorders(id);
      }


}
