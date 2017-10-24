package com.example.kakashi.scorekeeper;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class test extends AppCompatActivity {

    private TextView textView;
    private  SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textView = (TextView)findViewById(R.id.textView20);
        sharedPreferences = getSharedPreferences("TextActivity", 0);
        textView.setText(sharedPreferences.getString("textView20", "default value on first run"));
    }

    public void onEditClick(View view){
        Intent myIntent = new Intent(getApplicationContext(), EditActivity.class);
        myIntent.putExtra("text", textView.getText().toString());
        startActivityForResult(myIntent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            textView.setText(data.getStringExtra("answer"));
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("textView20", data.getStringExtra("answer"));
            editor.apply();

        }
    }
}
