package com.example.kakashi.scorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            //savedInstanceState.getString("TextViewText");


        }
    }

    public void showProfile(View view){
        Intent myIntent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivity(myIntent);
    }

    public void reportActivity(View view){
        Intent myIntent = new Intent(getApplicationContext(), ReportActivity.class);
        startActivity(myIntent);
    }

    public  void showScore (View view){
        Intent myIntent = new Intent(getApplicationContext(), ScoreActivity.class);
        startActivity(myIntent);
    }

    public void lesson(View view){
        Intent myIntent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(myIntent);
    }

}
