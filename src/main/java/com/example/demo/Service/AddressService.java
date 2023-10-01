package com.example.demo.Service;

import com.example.demo.Model.Address;
import com.example.demo.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public String addaddress(Address address) {
         addressRepo.save(address);
         return "added";
    }
}
