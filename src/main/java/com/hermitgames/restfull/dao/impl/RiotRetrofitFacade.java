package com.hermitgames.restfull.dao.impl;

import com.hermitgames.restfull.bo.RiotSummoner;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface RiotRetrofitFacade {

    @GET("/lol/summoner/v4/summoners/by-name/{summonerName}")
    Call<RiotSummoner> getSummonerByName(@Header("X-Riot-Token") String apiKey,
                                         @Path("summonerName") String name);
}
