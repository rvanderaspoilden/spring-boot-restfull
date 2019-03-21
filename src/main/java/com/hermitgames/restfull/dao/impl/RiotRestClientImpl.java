package com.hermitgames.restfull.dao.impl;

import com.hermitgames.restfull.bo.RiotSummoner;
import com.hermitgames.restfull.dao.RiotRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class RiotRestClientImpl implements RiotRestClient {

    @Value("${riot.rootUrl}")
    private String RIOT_API_URL;

    @Value("${riot.apiKey}")
    private String RIOT_API_KEY;

    @Autowired
    private RiotRetrofitFacade riotRetrofitFacade;

    @Bean
    public RiotRetrofitFacade init() {
        return new Retrofit.Builder()
                .baseUrl(RIOT_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RiotRetrofitFacade.class);
    }

    /** @inheritDoc **/
    @Override
    public RiotSummoner getSummoner(String name) {
        try {
            final Response<RiotSummoner> response = this.riotRetrofitFacade.getSummonerByName(RIOT_API_KEY, name).execute();

            if(response.isSuccessful()){
                return response.body();
            }
            return null;
        }catch (IOException e) {
            return null;
        }
    }
}
