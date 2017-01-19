package activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.karol.fitnesstracker.R;

/**
 * Created by Karol Zdebel on 2016-12-25.
 */

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_register);

        Button submitButton = (Button) findViewById(R.id.register_submit_button);

        final Intent goToLogin = new Intent(this, Login.class);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goToLogin);
            }
        });

    }
}