package com.example.giddu.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CustomFragmentAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    ArrayList<Fragment> Fragments;

    Fragment restaurantFragment;
    Fragment sightseeingFragment;
    Fragment shoppingFragment;
    Fragment outdoorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup all the fragments
        restaurantFragment = new RestaurantsFragments();
        sightseeingFragment = new SightseeingFragment();
        shoppingFragment = new ShoppingFragment();
        outdoorFragment = new OutdoorFragment();

        //setup ArrayList of fragments
        Fragments = new ArrayList();
        Fragments.add(restaurantFragment);
        Fragments.add(sightseeingFragment);
        Fragments.add(shoppingFragment);
        Fragments.add(outdoorFragment);

        //pass the ArrayList of fragments into the new adapter
        mCustomPagerAdapter = new CustomFragmentAdapter(getSupportFragmentManager(), this, Fragments);


        //setup the ViewPager and plug the adapter in
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(mCustomPagerAdapter);



    }
}
