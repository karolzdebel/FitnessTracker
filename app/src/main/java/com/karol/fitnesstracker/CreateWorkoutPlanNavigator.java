package com.karol.fitnesstracker;

import android.app.Fragment;

/**
 * Created by K on 2017-01-01.
 */

public interface CreateWorkoutPlanNavigator{
    void startInfoFragment();
    void startScheduleFragment();
    void startAddWorkoutFragment();
    void startCreateWeightWorkoutFragment();
    void startCreateCardioWorkoutFragment();
    void startCreateOtherWorkoutFragment();
    void startAddWeightExerciseFragment();
    void startAddCardioExerciseFragment();
    void startAddOtherExerciseFragment();
    void replaceFragment(Fragment fragment);
    void startFragment(Fragment fragment);
}
