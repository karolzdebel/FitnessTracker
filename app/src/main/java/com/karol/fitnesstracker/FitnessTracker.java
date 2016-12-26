package com.karol.fitnesstracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FitnessTracker extends AppCompatActivity {

    static final String LOGIN_PAGE = "com.example.action.LOGIN";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent showLoginPage = new Intent(this, Login.class);

        startActivity(showLoginPage);
    }

}
