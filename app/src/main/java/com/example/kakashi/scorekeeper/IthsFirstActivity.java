package com.example.kakashi.scorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IthsFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iths_first);
    }

    public void sendButton(View view){
        Intent myIntent = new Intent(getApplicationContext(), ithsSecondActivity.class);
        startActivity(myIntent);
    }

}
