package com.quantox.quantox.service.impl;

import com.quantox.quantox.Exception.ResourcenotFoundException;
import com.quantox.quantox.model.User;
import com.quantox.quantox.repository.UserRepository;
import com.quantox.quantox.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }



}
