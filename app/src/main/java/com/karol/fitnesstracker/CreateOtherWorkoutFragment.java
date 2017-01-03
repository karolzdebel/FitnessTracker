package com.karol.fitnesstracker;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by K on 2017-01-02.
 */

public class CreateOtherWorkoutFragment extends Fragment implements View.OnClickListener{

    private CreateWorkoutPlanNavigator myNavigator;

    @Override
    public void onAttach(Context context) {
        myNavigator = (CreateWorkoutPlanNavigator)context;
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.insert_workout_add_other_exercise,container,false);
        createButtonListeners(view);
        return view;
    }

    public CreateOtherWorkoutFragment(){
    }

    public static CreateOtherWorkoutFragment newInstance() {

        Bundle args = new Bundle();

        CreateOtherWorkoutFragment fragment = new CreateOtherWorkoutFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private void createButtonListeners(View v){
        v.findViewById(R.id.add_other_exercise_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("tag","Here");
        switch(v.getId()) {
            case R.id.add_other_exercise_button:
                myNavigator.replaceFragment(AddOtherExerciseFragment.newInstance());
        }
    }
}
