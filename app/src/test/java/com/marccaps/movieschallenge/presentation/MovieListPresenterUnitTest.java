package com.marccaps.movieschallenge.presentation;

import com.marccaps.movieschallenge.model.Movie;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class MovieListPresenterUnitTest {

    @Mock
    private MovieListContract.View mockView;

    private MovieListPresenter movieListPresenter;

    /*
    Mock Model Variables to test
     */

    @Mock
    private Movie movie;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        movieListPresenter = new MovieListPresenter(mockView);
    }

    @Test
    public void showProgressUnitTest() {
        /*/
        Should enable shimmerEffect when it's the first load
         */
        movieListPresenter.requestDataFromServer();
        Mockito.verify(mockView).showProgress();
    }

    @Test
    public void hideProgressUnitTest() {
        /*
        Should disable shimmerEffect when the load finishes
         */
        movieListPresenter.onFinished(mockMoviesList());
        Mockito.verify(mockView).hideProgress();
    }

    @Test
    public void setDataListUnitTest() {
        /*
        Should set data in the list
         */
        movieListPresenter.onFinished(mockMoviesList());
        Mockito.verify(mockView).setDataToList(mockMoviesList());
    }

    @Test
    public void onFailureUnitTest() {
        /*
        Should show the error retrieving data from the server.
         */
        Throwable t = new Throwable();
        movieListPresenter.onFailure(t);
        Mockito.verify(mockView).onResponseFailure(t);
    }

    private ArrayList<Movie> mockMoviesList(){
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(movie);
        return moviesList;
    }


}
