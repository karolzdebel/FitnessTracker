package fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.karol.fitnesstracker.R;

import interfaces.CreateWorkoutPlanNavigator;

/**
 * Created by K on 2017-01-02.
 */

public class AddWorkout extends Fragment implements View.OnClickListener{

    CreateWorkoutPlanNavigator myNavigator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.create_workout_plan_add_workouts,container,false);

        setCreateWorkoutButtons(view);

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myNavigator = (CreateWorkoutPlanNavigator) context;
    }

    public AddWorkout(){
    }

    public static AddWorkout newInstance() {

        Bundle args = new Bundle();

        AddWorkout fragment = new AddWorkout();
        fragment.setArguments(args);
        return fragment;
    }

    private void setCreateWorkoutButtons(View v){
        v.findViewById(R.id.create_workout_strength_button).setOnClickListener(this);
        v.findViewById(R.id.create_workout_cardio_button).setOnClickListener(this);
        v.findViewById(R.id.create_workout_other_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.create_workout_strength_button:
                myNavigator.startCreateWeightWorkoutFragment();
                break;
            case R.id.create_workout_cardio_button:
                myNavigator.startCreateCardioWorkoutFragment();
                break;
            case R.id.create_workout_other_button:
                myNavigator.startCreateOtherWorkoutFragment();
                break;


        }
    }
}
