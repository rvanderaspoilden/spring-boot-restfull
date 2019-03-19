package com.hermitgames.restfull.service;

import com.hermitgames.restfull.bo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service used to manage users
 */
public interface UserService {

    List<User> getAllUsers();
}
