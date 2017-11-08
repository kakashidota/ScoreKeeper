package com.example.kakashi.scorekeeper;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ReportActivity extends AppCompatActivity {


    Button btn1;
    User user = new User();


    Context context;
    CharSequence text;
    int duration;
    Toast toast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        user.setName("Robin");
        user.setAge(27);
        user.setTitle("President");
        user.setUskados(0);
        btn1 = (Button)findViewById(R.id.taskbtn1);



    }

    public void damsuga(View view){
        btn1.setText("Updated");
        btn1.setBackground(this.getResources().getDrawable(R.drawable.gradientback));
        user.addUskados(3);
        context = getApplicationContext();
        text = "WellPlayed! Your current balance is: " + user.getUskados();
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(context,text,duration);
        toast.show();
    }

}
