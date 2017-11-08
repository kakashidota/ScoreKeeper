package com.example.kakashi.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        //Comment
        int i = 2;
        testMetod(i);
    }

    private void testMetod(int k)
    {

    }
}
