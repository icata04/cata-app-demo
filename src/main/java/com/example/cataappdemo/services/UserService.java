package com.example.cataappdemo.services;


import com.example.cataappdemo.dto.UserDto;
import com.example.cataappdemo.entity.User;
import com.example.cataappdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
// UserService userService = new UserService();
// ApplicationContext.add(userService)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getUsers(){
        return userRepository.findAll();

    }

    public User getUserById(Long id)
    {
        return userRepository.findById(id).get();
    }
    public User addUser(UserDto userdto)
    {
        User user = new User(userdto.getName(),userdto.getEmail(),userdto.getAccesType());
        return userRepository.save(user);
    }


}
