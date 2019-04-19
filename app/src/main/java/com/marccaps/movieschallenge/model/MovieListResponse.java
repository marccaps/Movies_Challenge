package com.marccaps.movieschallenge.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieListResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("results")
    private List<Movie> results;

    @SerializedName("total_results")
    private int totalResults;

    @SerializedName("total_pages")
    private int totalPages;

    int getPage() {
        return page;
    }

    void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    void setResults(List<Movie> results) {
        this.results = results;
    }

    int getTotalResults() {
        return totalResults;
    }

    void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    int getTotalPages() {
        return totalPages;
    }

    void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public MovieListResponse(int page, List<Movie> results, int totalResults, int totalPages) {
        this.page = page;
        this.results = results;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
    }

    MovieListResponse () {

    }
}
