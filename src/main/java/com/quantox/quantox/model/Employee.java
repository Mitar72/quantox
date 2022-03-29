package com.quantox.quantox.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "first_name",nullable = false)
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name ="email")
    String Email;

}
