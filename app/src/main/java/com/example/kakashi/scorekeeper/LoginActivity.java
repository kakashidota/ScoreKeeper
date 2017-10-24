package com.example.kakashi.scorekeeper;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private Button btn;
    private EditText username;
    private EditText password;
    private TextView confirmView;
    private Button registerBtn;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn = (Button)findViewById(R.id.signinBtn);
        username = (EditText)findViewById(R.id.userNameView);
        password = (EditText)findViewById(R.id.passwordView);
        confirmView = (TextView) findViewById(R.id.greetView);
        registerBtn = (Button)findViewById(R.id.registerBtn);
        registerBtn.setBackgroundResource(0);
        registerBtn.getText();
        sharedPreferences = getSharedPreferences("Users", 0);

    }

    public void greet(View view){
        if (username.getText().toString().equals(sharedPreferences.getString("Username", "Robin")) && password.getText().toString().equals(sharedPreferences.getString("Password", "roobzter11"))){
            confirmView.setText("Hello " + username.getText());
            Intent myIntent = new Intent(getApplication(), MainActivity.class);
            startActivity(myIntent);
        } else {
            confirmView.setText("Wrong details");
        }

    }

    public void register(View view){
        Intent myIntent = new Intent(getApplicationContext(), registerActivity.class);
        startActivity(myIntent);
    }

}
