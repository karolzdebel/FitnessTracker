package com.karol.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

        final Intent createWorkoutIntent = new Intent(getActivity(),CreateWorkoutPlan.class);

        Button createWorkoutButton = (Button) workoutView.findViewById(R.id.workout_tab_create_workout_button);
        createWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(createWorkoutIntent);
            }
        });

        return workoutView;
    }
}
