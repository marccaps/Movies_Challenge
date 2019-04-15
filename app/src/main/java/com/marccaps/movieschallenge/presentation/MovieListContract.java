package com.marccaps.movieschallenge.presentation;

import com.marccaps.movieschallenge.model.Movie;

import java.util.List;

public interface MovieListContract {

    interface Service {

        interface OnFinishedListener {
            void onFinished(List<Movie> movieArrayList);

            void onFailure(Throwable t);
        }

        void getMovieList(OnFinishedListener onFinishedListener);

    }

    interface View {

        void showProgress();

        void hideProgress();

        void setDataToList(List<Movie> movieArrayList);

        void onResponseFailure(Throwable throwable);

    }

    interface Presenter {

        void onDestroy();

        void getMoreData();

        void requestDataFromServer();

    }
}
