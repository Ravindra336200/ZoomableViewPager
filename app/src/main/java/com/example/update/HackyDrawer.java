package com.example.update;

import android.content.Context;

import android.view.MotionEvent;

import androidx.drawerlayout.widget.DrawerLayout;

public class HackyDrawer extends DrawerLayout {

    public HackyDrawer(Context context) {
        super(context);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}
