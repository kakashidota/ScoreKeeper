package com.example.kakashi.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        String name = "whatsup";

        //Comment
        int i = 2;
        testMetod(i);
    }

    private void testMetod(int k)
    {

    }


    private void hejhejhej(View view){
        //kod här etc
        String name = "Robin";
        String fruit = "banan";
        String role = "ninja";
        String conclusion = "RObin is a bananan ninja!";
    }
}
