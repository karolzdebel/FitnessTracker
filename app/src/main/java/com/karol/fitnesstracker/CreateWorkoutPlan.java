package com.karol.fitnesstracker;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CreateWorkoutPlan extends AppCompatActivity implements CreateWorkoutPlanNavigator {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_workout_activity);

        fragmentManager = getFragmentManager();

        startInfoFragment();
    }

    public void startFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.create_workout_fragment_container,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.create_workout_fragment_container,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void startInfoFragment(){
        WorkoutPlanInfoFragment fragment = WorkoutPlanInfoFragment.newInstance();
        startFragment(fragment);
    }

    public void startScheduleFragment(){
        WorkoutPlanScheduleFragment fragment = WorkoutPlanScheduleFragment.newInstance();
        replaceFragment(fragment);
    }

    public void startAddWorkoutFragment(){
        AddWorkoutFragment fragment = AddWorkoutFragment.newInstance();
        replaceFragment(fragment);
    }

    @Override
    public void startCreateWeightWorkoutFragment() {
        CreateWeightWorkoutFragment fragment = CreateWeightWorkoutFragment.newInstance();
        replaceFragment(fragment);
    }

    @Override
    public void startCreateCardioWorkoutFragment() {
        CreateCardioWorkoutFragment fragment = CreateCardioWorkoutFragment.newInstance();
        replaceFragment(fragment);
    }

    @Override
    public void startCreateOtherWorkoutFragment() {
        CreateOtherWorkoutFragment fragment = CreateOtherWorkoutFragment.newInstance();
        replaceFragment(fragment);
    }

    @Override
    public void startAddWeightExerciseFragment() {

    }

    @Override
    public void startAddCardioExerciseFragment() {

    }

    @Override
    public void startAddOtherExerciseFragment() {

    }
}
