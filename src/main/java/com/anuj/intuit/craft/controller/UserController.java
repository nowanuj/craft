package com.anuj.intuit.craft.controller;


import com.anuj.intuit.craft.dto.User;
import com.anuj.intuit.craft.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<User> registerUser(@RequestBody User user){
            userService.registerUser(user);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int userId){
        userService.deleteUser(userId);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

}
