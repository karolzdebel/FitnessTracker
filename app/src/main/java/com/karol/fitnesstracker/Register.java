package com.karol.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by K on 2016-12-25.
 */

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

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