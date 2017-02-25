package com.example.giddu.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by giddu on 2/25/17.
 */

public class CustomFragmentAdapter extends FragmentPagerAdapter {


    private Context ctxt;
    private ArrayList<Fragment> fragments;

    public CustomFragmentAdapter(FragmentManager fm, Context context, ArrayList<Fragment> inputs) {
        super(fm);
        ctxt = context;
        fragments = inputs;
    }

    @Override
    public Fragment getItem(int position) {
        if(fragments != null){
            return fragments.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Restaurants";
            case 1:
                return "Sightseeing";
            case 2:
                return "Shopping";
            case 3:
                return "Outdoors";
        }

        return null;

    }
}
