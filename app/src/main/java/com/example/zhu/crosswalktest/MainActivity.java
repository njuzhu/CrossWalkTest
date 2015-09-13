package com.example.zhu.crosswalktest;

import android.app.Activity;
import android.os.Bundle;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkView;

public class MainActivity extends XWalkActivity {
    private XWalkView mXWalkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mXWalkView = (XWalkView) findViewById(R.id.activity_main);
//        mXWalkView.load("http://crosswalk-project.org/", null);
    }

    @Override
    protected void onXWalkReady() {

    }
}
