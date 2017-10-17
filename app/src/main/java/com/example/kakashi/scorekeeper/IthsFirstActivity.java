package com.example.kakashi.scorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class IthsFirstActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iths_first);
        editText = (EditText)findViewById(R.id.editText2);
    }

    public void sendButton(View view){
        Intent myIntent = new Intent(getApplicationContext(), ithsSecondActivity.class);
        myIntent.putExtra("Message",editText.getText().toString());
        startActivity(myIntent);
    }

}
