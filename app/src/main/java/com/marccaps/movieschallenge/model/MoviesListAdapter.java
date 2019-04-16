package com.marccaps.movieschallenge.model;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.marccaps.movieschallenge.R;
import com.marccaps.movieschallenge.utils.Constants;
import com.marccaps.movieschallenge.view.ShowList;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesListAdapter extends RecyclerView.Adapter<MoviesListAdapter.MyViewHolder> implements Filterable {

    private List<Movie> movieList;
    private List<Movie> originalMovieList;

    private ShowList showList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.single_movie_view, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    public MoviesListAdapter(ShowList showList, List<Movie> movieList) {
        this.showList = showList;
        this.movieList = movieList;
        this.originalMovieList = movieList;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Movie movie = movieList.get(i);

        myViewHolder.tvMovieTitle.setText(movie.getName());
        myViewHolder.tvMovieScore.setText(String.valueOf(movie.getVoteAverage()));
        myViewHolder.tvReleaseDate.setText(movie.getFirstAirDate());
        myViewHolder.tvReleaseDate.setBackgroundResource(R.color.transparent);

        Picasso.get().load(Constants.IMAGE_BASE_URL + movie.getPosterPath()).into(myViewHolder.ivMovieThumb);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_movie_title) public TextView tvMovieTitle;

        @BindView(R.id.tv_movie_score) public TextView tvMovieScore;

        @BindView(R.id.tv_release_date) public TextView tvReleaseDate;

        @BindView(R.id.iv_movie_thumb) public ImageView ivMovieThumb;


        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}


