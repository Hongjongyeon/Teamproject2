package com.example.teamproject2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Plan extends AppCompatActivity {
    private CalendarView calendarView;
    private Button btnAddPlan, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan);

        calendarView = findViewById(R.id.calendarView);
        btnAddPlan = findViewById(R.id.btnAddPlan);

        btnAddPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long selectedDateInMillis = calendarView.getDate();
                String selectedDate = convertMillisToDate(selectedDateInMillis);
                // 여기에 선택한 날짜를 이용하여 계획 추가 로직을 구현.
                Toast.makeText(Plan.this, "운동 계획 추가: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                long selectedDateInMillis = convertDateToMillis(year, month, dayOfMonth);
                //
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

    private long convertDateToMillis(int year, int month, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, dayOfMonth);
        return calendar.getTimeInMillis();
    }

    private String convertMillisToDate(long millis) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        return dateFormat.format(new Date(millis));
    }
}