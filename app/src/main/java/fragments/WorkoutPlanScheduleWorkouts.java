package fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.karol.fitnesstracker.R;

import interfaces.CreateWorkoutPlanNavigator;

/**
 * Created by K on 2017-01-02.
 */

public class WorkoutPlanScheduleWorkouts extends Fragment implements View.OnClickListener {

    CreateWorkoutPlanNavigator myNavigator;

    public WorkoutPlanScheduleWorkouts(){
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myNavigator = (CreateWorkoutPlanNavigator) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.create_workoutplan_schedule,container,false);
        setCreateWorkoutButtonsListeners(view);
        return view;
    }

    public static WorkoutPlanScheduleWorkouts newInstance() {

        Bundle args = new Bundle();

        WorkoutPlanScheduleWorkouts fragment = new WorkoutPlanScheduleWorkouts();
        fragment.setArguments(args);
        return fragment;
    }

    private void setCreateWorkoutButtonsListeners(View v){
        v.findViewById(R.id.create_workout_plan_create_workout_button_mon).setOnClickListener(this);
        v.findViewById(R.id.create_workout_plan_create_workout_button_tue).setOnClickListener(this);
        v.findViewById(R.id.create_workout_plan_create_workout_button_wed).setOnClickListener(this);
        v.findViewById(R.id.create_workout_plan_create_workout_button_thu).setOnClickListener(this);
        v.findViewById(R.id.create_workout_plan_create_workout_button_fri).setOnClickListener(this);
        v.findViewById(R.id.create_workout_plan_create_workout_button_sat).setOnClickListener(this);
        v.findViewById(R.id.create_workout_plan_create_workout_button_sun).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getTag().toString()){
            case "add_workout_button":
                myNavigator.startAddWorkoutFragment();

        }
    }
}
