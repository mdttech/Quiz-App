package com.example.android.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LessonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        Toast.makeText(this, "Click On The Lesson To Take The Quiz", Toast.LENGTH_LONG).show();
    }

    public void openUserInterfaceActivity(View view) {
        Intent i = new Intent(this, UserInterface.class);
        startActivity(i);
    }
    public void openUserInputActivity(View view) {
        Intent i = new Intent(this, UserInput.class);
        startActivity(i);
    }
    public void openMultiScreenAppActivity(View view) {
        Intent i = new Intent(this, MultiScreenApp.class);
        startActivity(i);
    }
    public void openNetworkingActivity(View view) {
        Intent i = new Intent(this, Networking.class);
        startActivity(i);
    }
    public void openDataStorageActivity(View view) {
        Intent i = new Intent(this, DataStorage.class);
        startActivity(i);
    }



    }
