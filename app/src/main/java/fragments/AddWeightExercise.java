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

public class AddWeightExercise extends Fragment implements View.OnClickListener{

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
        View view = inflater.inflate(R.layout.create_workout_plan_add_exercise_weight,container,false);

        createButtonListeners(view);

        return view;
    }

    public AddWeightExercise(){
    }

    public static AddWeightExercise newInstance() {

        Bundle args = new Bundle();

        AddWeightExercise fragment = new AddWeightExercise();
        fragment.setArguments(args);
        return fragment;
    }

    private void createButtonListeners(View v){
        v.findViewById(R.id.add_weight_exercise_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add_weight_exercise_button:
                myNavigator.replaceFragment(CreateWeightExercise.newInstance());
                break;
        }
    }
}
