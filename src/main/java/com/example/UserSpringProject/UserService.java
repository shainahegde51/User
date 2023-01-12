package com.example.UserSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntity user){
        userRepository.save(user);
    }
    public String getUserName(String mbl){
        UserEntity user=userRepository.findById(mbl).get();
        return user.getUserName();
    }
}
