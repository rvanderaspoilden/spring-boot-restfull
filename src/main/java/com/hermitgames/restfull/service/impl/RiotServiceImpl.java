package com.hermitgames.restfull.service.impl;

import com.hermitgames.restfull.bo.RiotSummoner;
import com.hermitgames.restfull.dao.RiotRestClient;
import com.hermitgames.restfull.service.RiotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiotServiceImpl implements RiotService {

    @Autowired
    private RiotRestClient riotRestClient;

    @Override
    public RiotSummoner getSummoner(String name) {
        return this.riotRestClient.getSummoner(name);
    }
}
