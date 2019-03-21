package com.hermitgames.restfull.dao;

import com.hermitgames.restfull.bo.RiotSummoner;

public interface RiotRestClient {

    /**
     * @param name
     * @return Summoner information from RIOT API
     */
    RiotSummoner getSummoner(String name);
}
