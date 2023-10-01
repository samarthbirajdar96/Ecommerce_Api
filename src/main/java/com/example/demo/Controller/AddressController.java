package com.example.demo.Controller;

import com.example.demo.Model.Address;
import com.example.demo.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;


    @PostMapping("address")

    public String addaddress(@RequestBody Address address){
        return addressService.addaddress(address);
    }

}
