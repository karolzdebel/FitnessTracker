package com.karol.fitnesstracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by K on 2017-01-02.
 */

public class WorkoutPlanScheduleFragment extends Fragment {

    public WorkoutPlanScheduleFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.insert_workout_page2,container,false);
        return view;
    }

    public static WorkoutPlanScheduleFragment newInstance() {

        Bundle args = new Bundle();

        WorkoutPlanScheduleFragment fragment = new WorkoutPlanScheduleFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
