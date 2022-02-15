package com.example.controller;

import com.example.entity.User;
import com.example.exception.UserNotFoundException;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<HttpStatus> save(@Valid @RequestBody User user) {
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{username}")
    public ResponseEntity<User> findByUsername(@PathVariable String username) {

        User user = userService.findByUsername(username);
        if (user == null) {
            throw new UserNotFoundException("User not found!");
        }
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }
}
