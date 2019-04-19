package com.marccaps.movieschallenge.model;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MovieListResponseUnitTest {

    private MovieListResponse movieListResponse;

    @Mock
    Movie movie;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        movieListResponse = new MovieListResponse();
    }

    @Test
    public void testGetPage () {
        int expectedPage = 2;
        movieListResponse.setPage(expectedPage);
        int actualPage = movieListResponse.getPage();
        Assert.assertEquals(expectedPage,actualPage);
    }

    @Test
    public void testGetListMovie () {
        List<Movie> expectedListMovie = new ArrayList<>();
        expectedListMovie.add(createMovie());
        expectedListMovie.add(movie);
        movieListResponse.setResults(expectedListMovie);
        List<Movie> actualListMovie = movieListResponse.getResults();
        Assert.assertEquals(expectedListMovie,actualListMovie);
    }

    private Movie createMovie() {
        Movie movie = new Movie();
        movie.setOriginalName("Game of Thrones");
        List<Integer> genreId = new ArrayList<>();
        genreId.add(18);
        genreId.add(10759);
        movie.setGenreIds(genreId);
        movie.setPopularity(710.153);
        movie.setVoteCount(5585);
        movie.setPosterPath("/qsD5OHqW7DSnaQ2afwz8Ptht1Xb.jpg");
        movie.setOriginalLanguage("en");
        movie.setId(1399);
        movie.setVoteAverage(8.2);
        return movie;
    }

    @Test
    public void testGetTotalResults () {
        int expectedTotalResults = 60;
        movieListResponse.setTotalResults(expectedTotalResults);
        int actualTotalResults = movieListResponse.getTotalResults();
        Assert.assertEquals(expectedTotalResults,actualTotalResults);
    }

    @Test
    public void testGetTotalPages () {
        int expectedTotalPages = 13;
        movieListResponse.setTotalPages(expectedTotalPages);
        int actualTotalPages = movieListResponse.getTotalPages();
        Assert.assertEquals(expectedTotalPages,actualTotalPages);
    }

}
