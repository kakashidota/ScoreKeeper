package com.example.kakashi.scorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ithsSecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iths_second);

        Intent intent = getIntent();

        String text = intent.getStringExtra("Message");
        textView = (TextView)findViewById(R.id.textView17);
        textView.setText(text);

    }


}
