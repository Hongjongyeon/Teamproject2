package com.example.teamproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button developer_info_btn = (Button) findViewById(R.id.Plan);
        developer_info_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Plan.class);
                startActivity(intent);
            }
        });


        Button Diet = (Button) findViewById(R.id.Diet);
        Diet.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Diet.class);
                startActivity(intent);
            }
        });

        Button Profile = (Button) findViewById(R.id.Profile);
        Profile.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Profile.class);
                startActivity(intent);
            }
        });

        Button Workout = (Button) findViewById(R.id.Workout);
        Workout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),Workout.class);
                startActivity(intent);
            }
        });
    }
}