package fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.karol.fitnesstracker.R;

/**
 * Created by Karol Zdebel on 2016-12-26.
 */

public class FitnessForm extends AppCompatActivity {

    private Spinner activityLevelSpinner;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_fitness_form);

        createSpinner();
    }

    private void createSpinner(){
        this.activityLevelSpinner = (Spinner) findViewById(R.id.fitness_form_activity_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.fitness_form_activity, android.R.layout.simple_spinner_dropdown_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activityLevelSpinner.setAdapter(adapter);
    }
}