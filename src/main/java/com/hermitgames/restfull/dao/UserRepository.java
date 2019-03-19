package com.hermitgames.restfull.dao;

import com.hermitgames.restfull.bo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
