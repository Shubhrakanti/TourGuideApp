package com.example.giddu.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragments extends Fragment {

    ListView cuisineView;
    ArrayList<Cuisine> cuisineList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_restaurants, container, false);

        //I know i didn't need to use a listView, but I was just practicing


        cuisineList = new ArrayList();
        cuisineList.add(new Cuisine(R.string.icasian, R.drawable.ic_asian_cuisine, 21));
        cuisineList.add(new Cuisine(R.string.icindian, R.drawable.ic_indian_cuisine, 21));
        cuisineList.add(new Cuisine(R.string.icamerican, R.drawable.ic_american_cuisine, 21));

        CuisineFragmentAdapter cuisineFragmentAdapter = new CuisineFragmentAdapter(getContext(), cuisineList);

        cuisineView = (ListView) rootView.findViewById(R.id.cuisineList);
        cuisineView.setAdapter(cuisineFragmentAdapter);



        return rootView;
    }


}
