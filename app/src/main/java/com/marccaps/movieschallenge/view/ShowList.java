package com.marccaps.movieschallenge.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.marccaps.movieschallenge.R;
import com.marccaps.movieschallenge.model.Movie;
import com.marccaps.movieschallenge.presentation.MovieListContract;
import com.marccaps.movieschallenge.presentation.MovieListPresenter;

import java.util.List;

public class ShowList extends AppCompatActivity implements MovieListContract.View {

    private static final String TAG = "MovieListActivity";

    private MovieListPresenter movieListPresenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_list_layout);

        movieListPresenter = new MovieListPresenter(this);

        movieListPresenter.requestDataFromServer();
    }


    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setDataToList(List<Movie> movieArrayList) {

    }

    @Override
    public void onResponseFailure(Throwable throwable) {

    }
}
