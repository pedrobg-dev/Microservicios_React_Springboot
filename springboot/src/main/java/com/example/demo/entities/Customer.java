package com.example.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.lang.reflect.GenericArrayType;

@Entity
@Table(name = "customer")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_customer")
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
}
