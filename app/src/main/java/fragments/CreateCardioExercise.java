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
 * Created by Karol Zdebel on 2017-01-02.
 */

public class CreateCardioExercise extends Fragment {

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
        return inflater.inflate(R.layout.create_workout_plan_create_exercise_cardio,container,false);
    }

    public CreateCardioExercise(){
    }

    public static CreateCardioExercise newInstance() {

        Bundle args = new Bundle();

        CreateCardioExercise fragment = new CreateCardioExercise();
        fragment.setArguments(args);
        return fragment;
    }

}
