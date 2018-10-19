package com.example.user.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "http://myjson.com/";

    @GET("yc6yg")
    Call<List<Hero>> getHerose();

}
