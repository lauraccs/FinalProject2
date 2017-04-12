package com.example.laura.finalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity extends BaseActivity {

    private Button btCalendar;
    private Button btActivities;
    private Button btWeather;
    private Button btCloset;
    private WebView wvHome;


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


        wvHome = (WebView) findViewById(R.id.wv_home);
        wvHome.getSettings().getJavaScriptEnabled();
        wvHome.setFocusable(true);
        wvHome.setFocusableInTouchMode(true);
        wvHome.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wvHome.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wvHome.getSettings().setDomStorageEnabled(true);
        wvHome.getSettings().setDatabaseEnabled(true);
        wvHome.getSettings().setAppCacheEnabled(true);
        wvHome.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wvHome.loadUrl("https://www.google.com/");
        wvHome.setWebViewClient(new WebViewClient());


    }

    public void initialView(){
        btCalendar = (Button) findViewById(R.id.bt_schedule);
        btActivities = (Button) findViewById(R.id.bt_activities);
        btWeather = (Button) findViewById(R.id.bt_weather);
        btCloset = (Button) findViewById(R.id.bt_closet);


    }

    public void initialListener(){
        btCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(CalendarActivity.class);
            }
        });


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

        btCloset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toActivity(ClosetActivity.class);
            }
        });






    }
}
