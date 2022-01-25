package com.efrei.webservice_spring_efrei.services;

import com.efrei.webservice_spring_efrei.model.User;
import com.efrei.webservice_spring_efrei.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;



    public User user(String username, String password){
        User user= userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
