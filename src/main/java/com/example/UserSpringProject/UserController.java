package com.example.UserSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addMovie(@RequestBody() UserEntity user){
        userService.addUser(user);
        return new ResponseEntity<>("the user is successfully added to the system", HttpStatus.CREATED);
    }

    @GetMapping("/userByMbl")
    public ResponseEntity<String> getStudentById(@RequestParam("mobileNumber") String mobileNumber) {
       String name=userService.getUserName(mobileNumber);
       System.out.println(name);
        return new ResponseEntity<>("Username is - " + name, HttpStatus.OK);
    }
}
