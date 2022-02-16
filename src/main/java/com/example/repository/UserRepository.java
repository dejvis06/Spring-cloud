package com.example.repository;

import com.example.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
