package com.quantox.quantox.controller;

import com.quantox.quantox.model.User;
import com.quantox.quantox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;

    @Autowired
    public userController(UserService serService) {
        super();
        this.userService = userService;
    }

    //build create employee REST API
    @PostMapping()
    public ResponseEntity<User> saveEmployee(@RequestBody User user){
    return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);

    }


}
