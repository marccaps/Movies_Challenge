package com.marccaps.movieschallenge.presentation;

import android.util.Log;

import com.marccaps.movieschallenge.model.Movie;
import com.marccaps.movieschallenge.model.MovieListResponse;
import com.marccaps.movieschallenge.service.ApiClient;
import com.marccaps.movieschallenge.service.MovieRestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.marccaps.movieschallenge.utils.Constants.API_KEY;

public class MovieListService implements MovieListContract.Service {

    private final String TAG = "MovieListService";

    @Override
    public void getMovieList(final OnFinishedListener onFinishedListener,int pageNumber) {

        MovieRestClient apiService =
                ApiClient.getClient().create(MovieRestClient.class);

        Call<MovieListResponse> call = apiService.getPopularMovies(API_KEY,pageNumber);
        call.enqueue(new Callback<MovieListResponse>() {
            @Override
            public void onResponse(Call<MovieListResponse> call, Response<MovieListResponse> response) {
                List<Movie> movies = response.body().getResults();
                Log.d(TAG, "Movies received: " + movies.size());
                onFinishedListener.onFinished(movies);
            }

            @Override
            public void onFailure(Call<MovieListResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
                onFinishedListener.onFailure(t);
            }
        });

    }
}
