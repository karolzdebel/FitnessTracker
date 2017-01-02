package com.karol.fitnesstracker;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.Spinner;

/**
 * Created by K on 2017-01-01.
 */

public class WorkoutPlanInfoFragment extends Fragment {

    private static final int MAX_WORKOUT_PLAN_LENGTH = 208;
    private static final int MIN_WORKOUT_PLAN_LENGTH = 1;
    private CreateWorkoutNavigator myNavigator;

    public WorkoutPlanInfoFragment(){
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.create_workout_menu,menu);
        super.onCreateOptionsMenu(menu,inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_create_workout_next:
                myNavigator.startScheduleFragment();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAttach(Context context) {
        myNavigator = (CreateWorkoutNavigator)context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.insert_workout_page1,container,false);

        createSpinners(view);
        createNumberPicker(view);

        return view;
    }

    public static WorkoutPlanInfoFragment newInstance() {

        Bundle args = new Bundle();

        WorkoutPlanInfoFragment fragment = new WorkoutPlanInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private void createSpinners(View view){
        Spinner goalSpinner = (Spinner) view.findViewById(R.id.create_workout_goal_spinner);
        Spinner intensitySpinner = (Spinner) view.findViewById(R.id.create_workout_intensity_spinner);
        Spinner exerciseSpinner = (Spinner) view.findViewById(R.id.create_workout_exercise_spinner);

        ArrayAdapter<CharSequence> goalAdapter = ArrayAdapter.createFromResource(getActivity()
            ,R.array.create_workout_primary_goal,android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> intensityAdapter = ArrayAdapter.createFromResource(getActivity()
                ,R.array.create_workout_intensity,android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> exerciseAdapter = ArrayAdapter.createFromResource(getActivity()
                ,R.array.create_workout_exercise_type,android.R.layout.simple_spinner_dropdown_item);


        goalSpinner.setAdapter(goalAdapter);
        intensitySpinner.setAdapter(intensityAdapter);
        exerciseSpinner.setAdapter(exerciseAdapter);
    }

    private void createNumberPicker(View view){
        NumberPicker numberPicker = (NumberPicker) view.findViewById(R.id.create_workout_length_number_picker);

        numberPicker.setMaxValue(MAX_WORKOUT_PLAN_LENGTH);
        numberPicker.setMinValue(MIN_WORKOUT_PLAN_LENGTH);
        numberPicker.setWrapSelectorWheel(false);
    }
}
