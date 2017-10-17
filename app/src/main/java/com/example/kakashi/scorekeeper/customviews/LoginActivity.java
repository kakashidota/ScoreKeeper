package com.example.kakashi.scorekeeper.customviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kakashi.scorekeeper.R;
import com.example.kakashi.scorekeeper.registerActivity;

public class LoginActivity extends AppCompatActivity {

    private Button btn;
    private EditText username;
    private EditText password;
    private TextView confirmView;
    private Button registerBtn;

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

    }

    public void greet(View view){
        confirmView.setText("Hello " + username.getText());
    }

    public void register(View view){
        Intent myIntent = new Intent(getApplicationContext(), registerActivity.class);
        startActivity(myIntent);
    }

}
