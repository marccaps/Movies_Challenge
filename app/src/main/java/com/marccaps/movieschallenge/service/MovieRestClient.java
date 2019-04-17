package com.marccaps.movieschallenge.service;

import com.marccaps.movieschallenge.model.MovieListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieRestClient {

        @GET("3/tv/popular")
        Call<MovieListResponse> getPopularMovies(@Query("api_key") String apiKey, @Query("page") int PageNumber);
}
