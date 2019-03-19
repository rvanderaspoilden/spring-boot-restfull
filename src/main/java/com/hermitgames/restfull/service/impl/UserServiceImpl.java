package com.hermitgames.restfull.service.impl;

import com.hermitgames.restfull.bo.User;
import com.hermitgames.restfull.dao.UserRepository;
import com.hermitgames.restfull.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service used to manage users
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
