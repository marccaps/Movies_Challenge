package com.marccaps.movieschallenge.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MovieUnitTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie();
    }

    @Test
    public void testGetOriginalName () {
        String expectedOriginalName = "Infinity War";
        movie.setOriginalName(expectedOriginalName);
        String actualOriginalName = movie.getOriginalName();
        Assert.assertEquals(expectedOriginalName,actualOriginalName);
    }

    @Test
    public void testGetGenreId () {
        List<Integer> expectedGenreId = new ArrayList<>();
        expectedGenreId.add(1);
        expectedGenreId.add(2);
        expectedGenreId.add(3);
        movie.setGenreIds(expectedGenreId);
        List<Integer> actualGenreId = movie.getGenreIds();
        Assert.assertEquals(expectedGenreId,actualGenreId);
    }

    @Test
    public void testGetName () {
        String expectedName = "Infinity War Movie Name";
        movie.setName(expectedName);
        String actualName = movie.getName();
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void testGetPopularity () {
        Double expectedPopularity = 8.6;
        movie.setPopularity(expectedPopularity);
        Double actualPopularity = movie.getPopularity();
        Assert.assertEquals(expectedPopularity,actualPopularity);
    }

    @Test
    public void testGetOriginCountry () {
        List<String> expectedOriginCountry = new ArrayList<>();
        expectedOriginCountry.add("Spain");
        expectedOriginCountry.add("United States");
        expectedOriginCountry.add("Germany");
        movie.setOriginCountry(expectedOriginCountry);
        List<String> actualOriginCountry = movie.getOriginCountry();
        Assert.assertEquals(expectedOriginCountry,actualOriginCountry);
    }

    @Test
    public void testGetVoteCount () {
        Integer expectedVoteCount = 1234;
        movie.setVoteCount(expectedVoteCount);
        Integer actualVoteCount = movie.getVoteCount();
        Assert.assertEquals(expectedVoteCount,actualVoteCount);
    }

    @Test
    public void testGetFirstAirDate () {
        String expectedFirstAirDate = "24/03/2015";
        movie.setFirstAirDate(expectedFirstAirDate);
        String actualFirstAirDate = movie.getFirstAirDate();
        Assert.assertEquals(expectedFirstAirDate,actualFirstAirDate);
    }

    @Test
    public void testGetBackdropPath () {
        String expectedBackdropPath = "/qsD5OHqW7DSnaQ2afwz8Ptht1Xb.jpg";
        movie.setBackdropPath(expectedBackdropPath);
        String actualBackdropPath = movie.getBackdropPath();
        Assert.assertEquals(expectedBackdropPath,actualBackdropPath);
    }

    @Test
    public void testGetOriginalLanguage () {
        String expectedOriginalLanguage = "en";
        movie.setOriginalLanguage(expectedOriginalLanguage);
        String actualOriginalLanguage = movie.getOriginalLanguage();
        Assert.assertEquals(expectedOriginalLanguage,actualOriginalLanguage);
    }

    @Test
    public void testGetId () {
        Integer expectedId = 1399;
        movie.setId(expectedId);
        Integer actualId = movie.getId();
        Assert.assertEquals(expectedId,actualId);
    }

    @Test
    public void testGetVoteAverage () {
        Double expectedVoteAverage = 8.5;
        movie.setVoteAverage(expectedVoteAverage);
        Double actualVoteAverage = movie.getVoteAverage();
        Assert.assertEquals(expectedVoteAverage,actualVoteAverage);
    }

    @Test
    public void testGetOverview () {
        String expectedOverview = "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.";
        movie.setOverview(expectedOverview);
        String actualOverview = movie.getOverview();
        Assert.assertEquals(expectedOverview,actualOverview);
    }

    @Test
    public void testGetPosterPath () {
        String expectedPosterPath = "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg";
        movie.setPosterPath(expectedPosterPath);
        String actualPosterPath = movie.getPosterPath();
        Assert.assertEquals(expectedPosterPath, actualPosterPath);
    }
}
