package com.example.cataappdemo.repositories;


import com.example.cataappdemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
