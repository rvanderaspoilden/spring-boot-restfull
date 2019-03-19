package com.hermitgames.restfull.ws;

import com.hermitgames.restfull.bo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestWS {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser() {
        final User user = new User();
        user.setAge(21);
        user.setName("Rodolphe");
        return user;
    }
}
