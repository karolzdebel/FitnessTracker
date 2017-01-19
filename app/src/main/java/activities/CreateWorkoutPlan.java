package activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.karol.fitnesstracker.R;

import fragments.AddWorkout;
import fragments.CreateCardioWorkout;
import fragments.CreateOtherWorkout;
import fragments.CreateWeightWorkout;
import fragments.WorkoutPlanGeneralForm;
import fragments.WorkoutPlanScheduleWorkouts;
import interfaces.CreateWorkoutPlanNavigator;

public class CreateWorkoutPlan extends AppCompatActivity implements CreateWorkoutPlanNavigator {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_workout_plan_main);

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
        WorkoutPlanGeneralForm fragment = WorkoutPlanGeneralForm.newInstance();
        startFragment(fragment);
    }

    public void startScheduleFragment(){
        WorkoutPlanScheduleWorkouts fragment = WorkoutPlanScheduleWorkouts.newInstance();
        replaceFragment(fragment);
    }

    public void startAddWorkoutFragment(){
        AddWorkout fragment = AddWorkout.newInstance();
        replaceFragment(fragment);
    }

    @Override
    public void startCreateWeightWorkoutFragment() {
        CreateWeightWorkout fragment = CreateWeightWorkout.newInstance();
        replaceFragment(fragment);
    }

    @Override
    public void startCreateCardioWorkoutFragment() {
        CreateCardioWorkout fragment = CreateCardioWorkout.newInstance();
        replaceFragment(fragment);
    }

    @Override
    public void startCreateOtherWorkoutFragment() {
        CreateOtherWorkout fragment = CreateOtherWorkout.newInstance();
        replaceFragment(fragment);
    }

}
