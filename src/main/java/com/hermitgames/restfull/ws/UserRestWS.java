package com.hermitgames.restfull.ws;

import com.hermitgames.restfull.bo.User;
import com.hermitgames.restfull.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestWS {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUser() {
        return this.userService.getAllUsers();
    }
}
