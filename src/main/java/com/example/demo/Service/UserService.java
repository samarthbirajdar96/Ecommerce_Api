package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public User addeUser(User user) {
        return userRepo.save(user);
    }

    public User getuserbyid(Integer id) {
        return userRepo.findById(id).orElseThrow();
    }

}


