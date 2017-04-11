package com.example.laura.finalproject2;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.laura.finalproject2.adapter.ViewPagerAdapter;
import com.example.laura.finalproject2.fragment.FragmentHat1;
import com.example.laura.finalproject2.fragment.FragmentTop1;
import com.example.laura.finalproject2.fragment.FragmentTop2;

import java.util.ArrayList;

public class ClosetActivity extends AppCompatActivity {
    private int checkedID;
    private RadioGroup rdg;
    ImageView imageView;


    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closet);
        changeView();

    }

    public void changeView(){

        rdg = (RadioGroup) findViewById(R.id.rdg_closet);


        checkedID = rdg.getCheckedRadioButtonId();

        switch (checkedID){
            case R.id.rb_sunny : imageView.setBackgroundResource(R.drawable.cap1);
                                    break;
            case R.id.rb_rainy: imageView.setBackgroundResource(R.drawable.outfit1);
                                    break;
        }





    }




}
