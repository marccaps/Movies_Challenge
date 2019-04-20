package com.marccaps.movieschallenge.view;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.view.View;

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
    public void ensureRecyclerViewIsPresent() throws Exception {
        ShowList activity = rule.getActivity();

        View viewById = activity.findViewById(R.id.moviesRecyclerView);

        assertThat(viewById,notNullValue());
        assertThat(viewById, instanceOf(RecyclerView.class));

        RecyclerView recyclerView = (RecyclerView) viewById;
        MoviesListAdapter adapter = (MoviesListAdapter) recyclerView.getAdapter();

        assertThat(adapter, instanceOf(MoviesListAdapter.class));
    }

}
