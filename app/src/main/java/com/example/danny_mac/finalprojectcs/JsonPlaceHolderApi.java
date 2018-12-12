package com.example.danny_mac.finalprojectcs;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface JsonPlaceHolderApi {
    @PowerMockIgnore("javax.net.ssl.*")
    @Headers("X-Auth-Token: c96d93889bad4c9f87acf3317295e340")
    @GET("players/44")
    Call<List<Post>> getPosts();
}
