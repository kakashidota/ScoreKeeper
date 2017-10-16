package com.example.kakashi.scorekeeper;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity {
    //referenser till grafiska komponenter
    private Button button3;
    private ProgressBar progressBar;
    private View online;
    private boolean onlineStatus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button3 = (Button)findViewById(R.id.button3);
        progressBar = (ProgressBar)findViewById(R.id.progressBar2);
        online = findViewById(R.id.onlineStatusView);

    }

    public void onButtonClicked(View view){

        button3.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                button3.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.INVISIBLE);
                onlineStatus = !onlineStatus;

                if(onlineStatus){
                    online.setVisibility(View.VISIBLE);

                } else {
                    online.setVisibility(View.INVISIBLE);
                }
            }
        },1000);

    }
}
