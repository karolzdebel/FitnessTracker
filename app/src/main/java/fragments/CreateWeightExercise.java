package fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import interfaces.CreateWorkoutPlanNavigator;
import com.karol.fitnesstracker.R;

/**
 * Created by K on 2017-01-02.
 */

public class CreateWeightExercise extends Fragment{

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
        View view = inflater.inflate(R.layout.create_workout_plan_create_exercise_weight,container,false);
        return view;
    }

    public CreateWeightExercise(){
    }

    public static CreateWeightExercise newInstance() {

        Bundle args = new Bundle();

        CreateWeightExercise fragment = new CreateWeightExercise();
        fragment.setArguments(args);
        return fragment;
    }
}
