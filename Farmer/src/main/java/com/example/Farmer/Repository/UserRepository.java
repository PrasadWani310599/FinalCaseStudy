package com.example.Farmer.Repository;

import com.example.Farmer.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User findByUsername(String username);
}
