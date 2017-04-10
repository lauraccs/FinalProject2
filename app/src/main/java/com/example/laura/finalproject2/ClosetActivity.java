package com.example.laura.finalproject2;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.laura.finalproject2.adapter.ViewPagerAdapter;
import com.example.laura.finalproject2.fragment.FragmentHat1;
import com.example.laura.finalproject2.fragment.FragmentTop1;
import com.example.laura.finalproject2.fragment.FragmentTop2;

import java.util.ArrayList;

public class ClosetActivity extends AppCompatActivity {
    private ViewPager topsViewPager;
    private ViewPager headWearViewPager;

    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closet);
        topsView();
        //headWearView();
    }

    public void topsView(){
        topsViewPager = (ViewPager) findViewById(R.id.tops_view_pager);
        fragmentList.add(new FragmentTop1());
        fragmentList.add(new FragmentTop2());

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        topsViewPager.setAdapter(viewPagerAdapter);


    }

    public void headWearView(){
        headWearViewPager = (ViewPager) findViewById(R.id.headwear_view_pager);
        //fragmentList.add(new FragmentHat1());

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        headWearViewPager.setAdapter(viewPagerAdapter);

    }


}
