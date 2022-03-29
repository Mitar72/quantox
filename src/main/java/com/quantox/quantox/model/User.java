package com.quantox.quantox.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      long id;
      @Column(name = "username",nullable = false)
      String userName;
      @Column(name = "password",nullable = false)
      String password;
      @Column(name = "firstName")
      String firstName;
      @Column(name = "lastName")
      String lastName;
    @OneToMany(mappedBy="createdBy")
      Set<Machine> machines;

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<Machine> getMachines() {
        return machines;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMachines(Set<Machine> machines) {
        this.machines = machines;
    }
}

