package com.example.nklab.service;

import com.example.nklab.pojo.User;
import com.example.nklab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserByPassword(String password){
        return userRepository.findUserByPassword(password);
    }

    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }

    public User findUserByEmailAndPassword(String email, String password){
        return userRepository.findUserByEmailAndPassword(email, password);
    }
}
