package com.example.update;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById( R.id.viewpager );
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter( this );
        viewPager.setAdapter(viewPagerAdapter);


    }
}
