package com.marccaps.movieschallenge.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.marccaps.movieschallenge.R;
import com.marccaps.movieschallenge.model.Movie;
import com.marccaps.movieschallenge.model.MoviesListAdapter;
import com.marccaps.movieschallenge.presentation.MovieListContract;
import com.marccaps.movieschallenge.presentation.MovieListPresenter;
import com.marccaps.movieschallenge.utils.Constants;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowList extends AppCompatActivity implements MovieListContract.View {

    private static final String TAG = "MovieListActivity";

    private MovieListPresenter movieListPresenter;
    private List<Movie> moviesList = new ArrayList<>();
    private MoviesListAdapter moviesListAdapter;
    private GridLayoutManager mLayoutManager;


    @BindView(R.id.moviesRecyclerView)
    RecyclerView recyclerViewMoviesList;
    @BindView(R.id.parentShimmerLayout)
    ShimmerFrameLayout parentShimmerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_list_layout);
        ButterKnife.bind(this);
        if(getSupportActionBar() != null) getSupportActionBar().setTitle(getString(R.string.popular_movies));

        initViews();

        /*
        Init Movie Service Presenter
         */
        movieListPresenter = new MovieListPresenter(this);
        movieListPresenter.requestDataFromServer();

    }

    private void initViews() {

        moviesListAdapter = new MoviesListAdapter(this,moviesList);
        mLayoutManager = new GridLayoutManager(this, Constants.NUMBER_OF_ROWS);
        recyclerViewMoviesList.setLayoutManager(mLayoutManager);
        recyclerViewMoviesList.setAdapter(moviesListAdapter);
    }


    @Override
    public void showProgress() {
        enableShimmerEffect();
    }

    @Override
    public void hideProgress() {
        disableShimmerEffect();
    }

    @Override
    public void setDataToList(List<Movie> movieArrayList) {
        moviesList.addAll(movieArrayList);
        moviesListAdapter.notifyDataSetChanged();
    }

    @Override
    public void onResponseFailure(Throwable throwable) {

    }

    private void disableShimmerEffect() {
        parentShimmerLayout.setVisibility(View.INVISIBLE);
        parentShimmerLayout.stopShimmer();
    }

    private void enableShimmerEffect() {
        parentShimmerLayout.startShimmer();
        parentShimmerLayout.setVisibility(View.VISIBLE);
    }
}
