package com.marccaps.movieschallenge.presentation;

import com.marccaps.movieschallenge.model.Movie;

import java.util.List;

public class MovieListPresenter implements MovieListContract.Presenter, MovieListContract.Service.OnFinishedListener{

    private static final String TAG = "MovieListPresenter";

    private MovieListContract.View movieListView;
    private MovieListContract.Service movieListService;

    public MovieListPresenter(MovieListContract.View movieListView) {
        this.movieListView = movieListView;
        movieListService = new MovieListService();
    }

    @Override
    public void onFinished(List<Movie> movieArrayList) {
        movieListView.setDataToList(movieArrayList);
        if (movieListView != null) {
            movieListView.hideProgress();
        }
    }

    @Override
    public void onFailure(Throwable t) {
        movieListView.onResponseFailure(t);
    }

    @Override
    public void onDestroy() {
        this.movieListView = null;
    }

    @Override
    public void getMoreData(int pageNumber) {
        if (movieListView != null) {
            movieListView.showProgress();
        }
        movieListService.getMovieList(this,pageNumber);
    }

    @Override
    public void requestDataFromServer() {
        if (movieListView != null) {
            movieListView.showProgress();
        }
        movieListService.getMovieList(this,1);
    }
}
