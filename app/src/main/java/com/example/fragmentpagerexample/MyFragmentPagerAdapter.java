package com.example.fragmentpagerexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.fragmentpagerexample.fragment.MyFragment;

/**
 * Created by 재화 on 2016-04-09.
 */
public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter{
    private static final int ITEM_COUNT = 5;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }
}
