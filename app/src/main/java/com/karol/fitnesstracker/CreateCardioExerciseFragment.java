package com.karol.fitnesstracker;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by K on 2017-01-02.
 */

public class CreateCardioExerciseFragment extends Fragment {

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
        View view = inflater.inflate(R.layout.insert_workout_create_cardio_exercise,container,false);

        return view;
    }

    public CreateCardioExerciseFragment(){
    }

    public static CreateCardioExerciseFragment newInstance() {

        Bundle args = new Bundle();

        CreateCardioExerciseFragment fragment = new CreateCardioExerciseFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
