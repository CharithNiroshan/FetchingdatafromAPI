package com.example.testapplication.posts.api;

import com.example.testapplication.posts.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {

    @GET("posts")
    Call<List<Post>> getposts();

}
