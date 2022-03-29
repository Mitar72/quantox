package com.quantox.quantox.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="machine")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(name = "uid",nullable = false)
    String uid;
    @Column(name = "status",nullable = false)
    boolean status;
    @Column(name = "active")
    boolean active;
    @ManyToOne
    @JoinColumn(name="createdBy", nullable=false)
    User createdBy;

}
