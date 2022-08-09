package com.example.cataappdemo.controllers;


import com.example.cataappdemo.dto.UserDto;
import com.example.cataappdemo.entity.User;
import com.example.cataappdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
// UserController userController = new UserController();
// ApplicationContext.add(userController)
public class UserController {

    @Autowired
    private UserService userService;

//    public UserController(UserService userService){
//        this.userService = userService;
//    }

    @GetMapping
    public Iterable<User> getUsers() {

        return userService.getUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id)
    {
        User user = userService.getUserById(id);
        return  user;

    }
    @PostMapping
    public User addUser(@RequestBody UserDto userdto)
    {

        return userService.addUser(userdto);


    }



}
