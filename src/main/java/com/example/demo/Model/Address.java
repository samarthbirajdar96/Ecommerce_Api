package com.example.demo.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer addressId;

    private String addressName;

    private String addressLandmark;

    private String addressNumber;

    private String addressZipcode;

    private String addressState;

    @ManyToOne
    @JoinColumn(name="fk_userId")
    User user;
}
