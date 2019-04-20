package com.marccaps.movieschallenge.view;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.marccaps.movieschallenge.R;
import com.marccaps.movieschallenge.model.MoviesListAdapter;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(AndroidJUnit4.class)
public class ShowListActivityTest {

    @Rule
    public ActivityTestRule<ShowList> rule  = new ActivityTestRule<>(ShowList.class);

    @Test
    public void ensureRecyclerViewIsPresent() {
        ShowList activity = rule.getActivity();

        View moviesRecyclerView = activity.findViewById(R.id.moviesRecyclerView);

        assertThat(moviesRecyclerView,notNullValue());
        assertThat(moviesRecyclerView, instanceOf(RecyclerView.class));

        RecyclerView recyclerView = (RecyclerView) moviesRecyclerView;
        MoviesListAdapter moviesListAdapter = (MoviesListAdapter) recyclerView.getAdapter();

        assertThat(moviesListAdapter, instanceOf(MoviesListAdapter.class));
    }

    @Test
    public void ensureNoDataViewIsPresent() {
        ShowList activity = rule.getActivity();

        View errorLayoutView = activity.findViewById(R.id.error_layout);

        assertThat(errorLayoutView,notNullValue());
        assertThat(errorLayoutView, instanceOf(RelativeLayout.class));

    }

    @Test
    public void ensureShimmerLoaderIsPresent() {
        ShowList activity = rule.getActivity();

        View shimmerLayoutView = activity.findViewById(R.id.parentShimmerLayout);

        assertThat(shimmerLayoutView,notNullValue());
        assertThat(shimmerLayoutView, instanceOf(ShimmerFrameLayout.class));
    }

}
