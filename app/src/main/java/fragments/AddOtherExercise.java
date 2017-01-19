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

public class AddOtherExercise extends Fragment implements View.OnClickListener{

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
        View view = inflater.inflate(R.layout.create_workout_plan_add_exercise_other,container,false);

        createButtonListeners(view);

        return view;
    }

    public AddOtherExercise(){
    }

    public static AddOtherExercise newInstance() {

        Bundle args = new Bundle();

        AddOtherExercise fragment = new AddOtherExercise();
        fragment.setArguments(args);
        return fragment;
    }

    private void createButtonListeners(View v){
        v.findViewById(R.id.create_other_exercise_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.create_other_exercise_button:
                myNavigator.replaceFragment(CreateOtherExercise.newInstance());
                break;
        }
    }
}
