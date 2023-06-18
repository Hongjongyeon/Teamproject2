package com.example.teamproject2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Diet extends AppCompatActivity {

    private Spinner amountSpinner;
    private TextView dietTextView;

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet);

        amountSpinner = findViewById(R.id.amountSpinner);
        dietTextView = findViewById(R.id.dietTextView);

        Button generateDietButton = findViewById(R.id.generateDietButton);
        generateDietButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedAmountCategory = amountSpinner.getSelectedItem().toString();
                String diet = generateDietByAmountCategory(selectedAmountCategory);
                dietTextView.setText(diet);
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

    private String generateDietByAmountCategory(String amountCategory) {
        String diet;
        switch (amountCategory) {
            case "0~5000":
                diet = "채소(칼로리:)\n잡곡(칼로리:)"+System.getProperty("line.separator");
                break;
            case "5000~10000":
                diet = " 잡곡(칼로리:)\n 육류(칼로리:)\n 채소(칼로리:)"+System.getProperty("line.separator");
                break;
            case "10000~15000":
                diet = "탄수화물(칼로리:)\n 지방(칼로리:)\n 단백질(칼로리:)"+System.getProperty("line.separator");
                break;
            case "15000~":
                diet = "지방(칼로리:)\n 단백질(칼로리:)"+System.getProperty("line.separator");
                break;
            default:
                diet = "";
        }
        return diet;
    }
}
