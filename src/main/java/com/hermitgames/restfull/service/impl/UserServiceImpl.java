package com.hermitgames.restfull.service.impl;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.hermitgames.restfull.bo.User;
import com.hermitgames.restfull.dao.AccountRepository;
import com.hermitgames.restfull.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Service used to manage users
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AccountRepository accountRepository;

    public List<User> getAllUsers() {
        return (List<User>) this.accountRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        final String passwordHash = Hashing.sha256().hashString(user.getPassword(), Charsets.UTF_8).toString();
        user.setPassword(passwordHash);
        user.setCreation_date(LocalDateTime.now());

        return this.accountRepository.save(user);
    }
}
