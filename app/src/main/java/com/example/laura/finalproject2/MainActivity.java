package com.example.laura.finalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity extends BaseActivity {

    private Button btCalendar;
//    private Button btCloset;
    private Button btActivities;
    private Button btWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        initialListener();

        TextView tvDate = (TextView) findViewById(R.id.tv_date);
        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy \nh:mm a");
        String dateString = sdf.format(date);
        tvDate.setText(dateString);
    }

    public void initialView(){
        btCalendar = (Button) findViewById(R.id.bt_schedule);
//        btCloset = (Button) findViewById(R.id.bt_closet);
        btActivities = (Button) findViewById(R.id.bt_activities);
        btWeather = (Button) findViewById(R.id.bt_weather);

    }

    public void initialListener(){
        btCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(CalendarActivity.class);
            }
        });

//        btCloset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                toActivity(ClosetActivity.class);
//            }
//        });

        btActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(ActivitiesActivity.class);
            }
        });

        btWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(WeatherActivity.class);
            }
        });

    }
}
