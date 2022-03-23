package com.example.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_supplier")
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String address;
    private String web;
    private String contact;
}
