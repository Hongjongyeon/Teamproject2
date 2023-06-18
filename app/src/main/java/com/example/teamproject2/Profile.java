package com.example.teamproject2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private EditText editName, editAge, editGender, editHeight, editWeight;
    private Button btnSave, btnExerciseEnd, btnBack;
    private TextView tvPoints;
    private int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        editName = findViewById(R.id.editName);
        editAge = findViewById(R.id.editAge);
        editGender = findViewById(R.id.editGender);
        editHeight = findViewById(R.id.editHeight);
        editWeight = findViewById(R.id.editWeight);
        tvPoints = findViewById(R.id.tvPoints);

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProfile();
            }
        });

        btnExerciseEnd = findViewById(R.id.btnExerciseEnd);
        btnExerciseEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endExercise();
            }
        });

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void saveProfile() {
        String name = editName.getText().toString();
        String ageText = editAge.getText().toString();
        String gender = editGender.getText().toString();
        String heightText = editHeight.getText().toString();
        String weightText = editWeight.getText().toString();

        if (name.isEmpty() || ageText.isEmpty() || gender.isEmpty() || heightText.isEmpty() || weightText.isEmpty()) {
            Toast.makeText(Profile.this, "정보를 입력해주세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        int age = Integer.parseInt(ageText);
        double height = Double.parseDouble(heightText);
        double weight = Double.parseDouble(weightText);


        Toast.makeText(Profile.this, "프로필이 저장되었습니다.", Toast.LENGTH_SHORT).show();
    }

    private void endExercise() {
        points += 10;
        tvPoints.setText("포인트: " + points);
        Toast.makeText(Profile.this, "수고하셨습니다. 현재 포인트: " + points, Toast.LENGTH_SHORT).show();
    }
}