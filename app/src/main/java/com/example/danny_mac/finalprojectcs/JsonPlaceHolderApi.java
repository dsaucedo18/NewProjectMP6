package com.example.danny_mac.finalprojectcs;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface JsonPlaceHolderApi {
    @Headers({"application-id: X-Auth-Token",
            "secret-key: c96d93889bad4c9f87acf3317295e340",
            "application-type: GET"})

    @GET("competitions/2021/standings")
    Call<List<Post>> getPosts();
}
