package com.karol.fitnesstracker;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by K on 2016-12-27.
 */

public class WorkoutTab extends Fragment{

    public WorkoutTab(){
    }

    public static WorkoutTab newInstance() {

        Bundle args = new Bundle();

        WorkoutTab fragment = new WorkoutTab();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View workoutView = inflater.inflate(R.layout.workout_layout,container,false);
        return workoutView;
    }
}
