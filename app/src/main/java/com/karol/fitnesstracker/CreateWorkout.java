package com.karol.fitnesstracker;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CreateWorkout extends AppCompatActivity implements CreateWorkoutNavigator{
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_workout_activity);

        fragmentManager = getFragmentManager();

        startInfoFragment();
    }

    public void startInfoFragment(){
        WorkoutPlanInfoFragment fragment = WorkoutPlanInfoFragment.newInstance();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.create_workout_fragment_container,fragment);
        fragmentTransaction.commit();
    }

    public void startScheduleFragment(){
        WorkoutPlanScheduleFragment fragment = WorkoutPlanScheduleFragment.newInstance();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.create_workout_fragment_container,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
