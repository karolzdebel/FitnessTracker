package com.karol.fitnesstracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by K on 2016-12-26.
 */

public class Login extends AppCompatActivity{

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        Button loginButton = (Button) findViewById(R.id.login_login_button);
        Button registerButton = (Button) findViewById(R.id.login_register_button);

        final Intent registerIntent = new Intent(this, Register.class);
        final Intent mainTabsIntent = new Intent(this, MainTabs.class);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(mainTabsIntent);
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(registerIntent);
            }
        });

    }
}
