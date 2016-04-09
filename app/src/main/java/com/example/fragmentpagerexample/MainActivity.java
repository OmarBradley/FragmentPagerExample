package com.example.fragmentpagerexample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragmentpagerexample.fragment.MyFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.pager) ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //겔러리 식으로 하려고.-> 메인 화면이 보여질 때 옆에 화면들이 cliping되서 짤릴 경우를 막아줘야 한다
        pager.setClipToPadding(false);
        pager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.pager_margin));
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
    }
}
