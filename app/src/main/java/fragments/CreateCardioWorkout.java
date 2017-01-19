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

public class CreateCardioWorkout extends Fragment implements View.OnClickListener{

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
        View view = inflater.inflate(R.layout.create_workout_plan_create_workout_cardio,container,false);
        createButtonListeners(view);
        return view;
    }

    public CreateCardioWorkout(){
    }

    public static CreateCardioWorkout newInstance() {

        Bundle args = new Bundle();

        CreateCardioWorkout fragment = new CreateCardioWorkout();
        fragment.setArguments(args);
        return fragment;
    }

    private void createButtonListeners(View v){
        v.findViewById(R.id.add_cardio_exercise_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add_cardio_exercise_button:
                myNavigator.replaceFragment(AddCardioExercise.newInstance());
        }
    }
}
