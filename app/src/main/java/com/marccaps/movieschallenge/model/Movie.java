package com.marccaps.movieschallenge.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {

    @SerializedName("original_name")
    private String originalName;
    @SerializedName("genre_ids")
    private List<Integer> genreIds = null;
    @SerializedName("name")
    private String name;
    @SerializedName("popularity")
    private Double popularity;
    @SerializedName("origin_country")
    private List<String> originCountry = null;
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("first_air_date")
    private String firstAirDate;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("id")
    private Integer id;
    @SerializedName("vote_average")
    private Double voteAverage;
    @SerializedName("overview")
    private String overview;
    @SerializedName("poster_path")
    private String posterPath;

    public Movie(String originalName, List<Integer> genreIds, String name, Double popularity, List<String> originCountry,
                 Integer voteCount, String firstAirDate, String backdropPath, String originalLanguage,
                 Integer id, Double voteAverage, String overview, String posterPath) {
        this.originalName = originalName;
        this.genreIds = genreIds;
        this.name = name;
        this.popularity = popularity;
        this.originCountry = originCountry;
        this.voteCount = voteCount;
        this.firstAirDate = firstAirDate;
        this.backdropPath = backdropPath;
        this.originalLanguage = originalLanguage;
        this.id = id;
        this.voteAverage = voteAverage;
        this.overview = overview;
        this.posterPath = posterPath;
    }

    Movie() {

    }

    String getOriginalName() {
        return originalName;
    }

    void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    List<Integer> getGenreIds() {
        return genreIds;
    }

    void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Double getPopularity() {
        return popularity;
    }

    void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    List<String> getOriginCountry() {
        return originCountry;
    }

    void setOriginCountry(List<String> originCountry) {
        this.originCountry = originCountry;
    }

    Integer getVoteCount() {
        return voteCount;
    }

    void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    String getFirstAirDate() {
        return firstAirDate;
    }

    void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    String getBackdropPath() {
        return backdropPath;
    }

    void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    String getOriginalLanguage() {
        return originalLanguage;
    }

    void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    Integer getId() {
        return id;
    }

    void setId(Integer id) {
        this.id = id;
    }

    Double getVoteAverage() {
        return voteAverage;
    }

    void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    String getOverview() {
        return overview;
    }

    void setOverview(String overview) {
        this.overview = overview;
    }

    String getPosterPath() {
        return posterPath;
    }

    void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
}
