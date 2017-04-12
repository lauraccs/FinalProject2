package com.example.laura.finalproject2;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.laura.finalproject2.adapter.ViewPagerAdapter;
import com.example.laura.finalproject2.fragment.FragmentHat1;
import com.example.laura.finalproject2.fragment.FragmentTop1;
import com.example.laura.finalproject2.fragment.FragmentTop2;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ClosetActivity extends AppCompatActivity {

    private int checkedID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closet);
        ButterKnife.bind(this);
        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Toast.makeText(getApplicationContext(),"Checked",Toast.LENGTH_LONG).show();
                checkedID = checkedId;
            }
        });
        rdg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkedID = checkedId;
            }
        });

        rdg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkedID = checkedId;
            }
        });

        rdg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkedID = checkedId;
            }
        });
        //set on click listener for each radio group then bind each view then set method for click of each ok button


    }
    @BindView(R.id.view_closet) ImageView ivCloset;
    @BindView(R.id.view_closet2) ImageView ivCloset2;
    @BindView(R.id.view_closet3) ImageView ivCloset3;
    @BindView(R.id.view_closet4) ImageView ivCloset4;


    @BindView(R.id.rdg_closet) RadioGroup rdg;

    @OnClick(R.id.bt_closet_ok)
    public void okClick(){
        Toast.makeText(getApplicationContext(),"Ok", Toast.LENGTH_LONG).show();

        switch (checkedID){
            case R.id.rb_accessory1:
                ivCloset.setImageResource(R.drawable.cap1);
                break;
            case R.id.rb_accessory2:
                ivCloset.setImageResource(R.drawable.strawhat);
                break;
            case R.id.rb_accessory3:
                ivCloset.setImageResource(R.drawable.tophat);
                break;
            case R.id.rb_accessory4:
                ivCloset.setImageResource(R.drawable.pharrell_hat);
                break;

            default:
        }


    }

    @BindView(R.id.rdg_closet2) RadioGroup rdg2;
    @OnClick(R.id.bt_closet_two)
    public void okClickTwo(){

        switch (checkedID){
            case R.id.rb_tops1:
                ivCloset2.setImageResource(R.drawable.whitetee);
                break;
            case R.id.rb_tops2:
                ivCloset2.setImageResource(R.drawable.blackbandtee);
                break;
            case R.id.rb_tops3:
                ivCloset2.setImageResource(R.drawable.tuxtop);
                break;
            case R.id.rb_tops4:
                ivCloset2.setImageResource(R.drawable.activetshirt);
                break;

            default:

        }

    }

    @BindView(R.id.rdg_closet3) RadioGroup rdg3;
    @OnClick(R.id.bt_closet_three)
    public void okClickThree(){

        switch (checkedID){
            case R.id.rb_pants1:
                ivCloset3.setImageResource(R.drawable.rippedjeans);
                break;
            case R.id.rb_pants2:
                ivCloset3.setImageResource(R.drawable.overalls);
                break;
            case R.id.rb_pants3:
                ivCloset3.setImageResource(R.drawable.pantswhite);
                break;
            case R.id.rb_pants4:
                ivCloset3.setImageResource(R.drawable.activepants);
                break;


            default:
        }

    }

    @BindView(R.id.rdg_closet4) RadioGroup rdg4;
    @OnClick(R.id.bt_closet_four)
    public void okClickFour(){

        switch (checkedID){
            case R.id.rb_bottom1:
                ivCloset4.setImageResource(R.drawable.lightblueshoes);
                break;
            case R.id.rb_bottom2:
                ivCloset4.setImageResource(R.drawable.cowboyboots);
                break;
            case R.id.rb_bottom3:
                ivCloset4.setImageResource(R.drawable.tapshoes);
                break;
            case R.id.rb_bottom4:
                ivCloset4.setImageResource(R.drawable.activesneaker);
                break;
            default:
        }

    }











}
