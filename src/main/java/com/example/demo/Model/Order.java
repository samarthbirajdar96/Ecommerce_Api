package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "fk_userId")
     User user;

    @ManyToOne
    @JoinColumn(name = "fk_productId")
    Product product;

    @ManyToOne
    @JoinColumn(name = "fk_addressId")
     Address address;

    private Integer productQuantity;

}
