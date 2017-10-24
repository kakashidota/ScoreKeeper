package com.example.kakashi.scorekeeper;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {

    private EditText username;
    private EditText pw;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText)findViewById(R.id.editText6);
        pw = (EditText)findViewById(R.id.editText4);
    }

    public void onRegister(View view){
        sharedPreferences =  getSharedPreferences("Users", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Username", username.getText().toString());
        editor.putString("Password", pw.getText().toString());
        editor.commit();

        Intent myIntent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(myIntent);

    }
}
