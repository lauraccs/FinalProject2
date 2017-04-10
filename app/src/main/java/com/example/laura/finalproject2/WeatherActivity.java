package com.example.laura.finalproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WeatherActivity extends AppCompatActivity {

    WebView weatherWV;

    @Override
    public void onBackPressed(){
        if(weatherWV.canGoBack()){
            weatherWV.goBack();
        }else {
            super.onBackPressed();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        weatherWV = (WebView) findViewById(R.id.weather_wv);
        weatherWV.getSettings().setJavaScriptEnabled(true);
        weatherWV.setFocusable(true);
        weatherWV.setFocusableInTouchMode(true);
        weatherWV.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        weatherWV.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        weatherWV.getSettings().setDomStorageEnabled(true);
        weatherWV.getSettings().setDatabaseEnabled(true);
        weatherWV.getSettings().setAppCacheEnabled(true);
        weatherWV.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        weatherWV.loadUrl("https://tinyurl.com/l8nv3qv");
        weatherWV.setWebViewClient(new WebViewClient());
    }
}
