package com.example.laura.finalproject2;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laura.finalproject2.adapter.ListViewAdapter;
import com.example.laura.finalproject2.adapter.ViewPagerAdapter;
import com.example.laura.finalproject2.fragment.FragmentHat1;
import com.example.laura.finalproject2.fragment.FragmentTop1;

import java.util.ArrayList;

public class ActivitiesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayList<String> listResult;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        listResult = new ArrayList<String>();
        createFakeResult();
        initialView();

//        setPager(viewPager);
    }

    private void createFakeResult() {
        listResult.add("AAAAAAAAAA");
        listResult.add("BBBBBBB");
        listResult.add("CDDDD");
        listResult.add("DDDDDDDDDDD");
        listResult.add("EE");
        listResult.add("FF");
        listResult.add("GGG");
        listResult.add("H");
        listResult.add("I");
        listResult.add("J");
        listResult.add("K");
        listResult.add("L");
        listResult.add("M");
        listResult.add("N");
        listResult.add("O");
        listResult.add("P");
        listResult.add("Q");


    }

    private void initialView() {

        listView = (ListView) findViewById(R.id.activities_list_view);
        View view = getLayoutInflater().inflate(R.layout.activities_header,null);
        LinearLayout activitiesHeader = (LinearLayout)view.findViewById(R.id.activities_header);

        viewPager = (ViewPager)view.findViewById(R.id.header_view_pager);
        fragmentList.add(new FragmentTop1());
        fragmentList.add(new FragmentHat1());


        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);

        ListViewAdapter listViewAdapter = new ListViewAdapter(this, listResult);

        TextView tv = new TextView(this);
        tv.setText("We have no more content");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);


        listView.setAdapter(listViewAdapter);
        listView.addHeaderView(activitiesHeader,null,false);

        final DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final int width = displayMetrics.widthPixels;


        AbsListView.LayoutParams headerViewParams = new AbsListView.LayoutParams(width, 300);
        activitiesHeader.setLayoutParams(headerViewParams);


//
//        listView = (ListView) findViewById(R.id.list_view);
//        View view = getLayoutInflater().inflate(R.layout.list_view_header,null);
//        LinearLayout listViewHeader = (LinearLayout)view.findViewById(R.id.list_view_header);
//
//        viewPager = (ViewPager)view.findViewById(R.id.header_view_pager);
//        fragmentList.add(new PicOneFragment());
//        fragmentList.add(new PicTwoFragment());
//        fragmentList.add(new PicThreeFragment());


//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
//        viewPagerAdapter.setContent(fragmentList);
//        viewPager.setAdapter(viewPagerAdapter);
//
//
//        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listResult);
//        listView.addHeaderView(listViewHeader,null,false);
////this is the only list view attribute changed, added two more params




//        listView.setAdapter(listViewAdapter);
//        listView.setOnItemClickListener(this);
//
//        final DisplayMetrics displayMetrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        final int width = displayMetrics.widthPixels;
//
//
//        AbsListView.LayoutParams headerViewParams = new AbsListView.LayoutParams(width, 300);
//        listViewHeader.setLayoutParams(headerViewParams);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
