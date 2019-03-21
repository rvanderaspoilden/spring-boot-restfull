package com.hermitgames.restfull.ws;

import com.hermitgames.restfull.bo.RiotSummoner;
import com.hermitgames.restfull.bo.User;
import com.hermitgames.restfull.service.RiotService;
import com.hermitgames.restfull.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("summoners")
public class RiotRestWS {

    @Autowired
    private RiotService riotService;

    @RequestMapping(value = "/by-name/{summonerName}", method = RequestMethod.GET)
    public RiotSummoner getSummoner(@PathVariable("summonerName") String name) {
        return this.riotService.getSummoner(name);
    }
}
