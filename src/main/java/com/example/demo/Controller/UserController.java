package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("user")
    public User addUser(@RequestBody User user) {
        return userService.addeUser(user);
    }

    @GetMapping("user/id/{id}")
    public User getuserbyid(@PathVariable Integer id){
        return userService.getuserbyid(id);
    }
}
