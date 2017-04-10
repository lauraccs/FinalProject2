package com.example.laura.finalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView tvCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        tvCalendar = (TextView) findViewById(R.id.tv_Calendar);
        calendarView = (CalendarView) findViewById(R.id.calendar);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                tvCalendar.setText(month+ "/" + dayOfMonth + "/" + year);
            }
        });
    }
}
