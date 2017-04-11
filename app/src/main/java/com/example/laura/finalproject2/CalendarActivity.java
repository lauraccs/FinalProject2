package com.example.laura.finalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView tvCalendar;
    TextView tvSetEvent;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        tvCalendar = (TextView) findViewById(R.id.tv_Calendar);
        tvSetEvent = (TextView) findViewById(R.id.tv_setEvent);
        input = (EditText) findViewById(R.id.tv_edit);
        calendarView = (CalendarView) findViewById(R.id.calendar);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                tvCalendar.setText( month+ "/" + dayOfMonth + "/" + year +"\n");
                tvSetEvent.setText(input.getText());

            }
        });
    }
}
