package com.example.giddu.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    ListView sightsView;
    ArrayList<ViewSpot> sightsList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.viewspot_list, container, false);

        sightsList = new ArrayList<>();
        sightsList.add(new ViewSpot(R.drawable.westfield_mall, "Westfield"));
        sightsList.add(new ViewSpot(R.drawable.stonestown_galleria, "Stonestown Galleria"));
        sightsList.add(new ViewSpot(R.drawable.crocker_galleria, "Crocker Galleria"));
        sightsList.add(new ViewSpot(R.drawable.union_square, "Union Square"));


        ViewSpotFragmentAdapter viewSpotFragmentAdapter = new ViewSpotFragmentAdapter(getContext(), sightsList);


        sightsView = (ListView) rootView.findViewById(R.id.viewSpotListView);
        sightsView.setAdapter(viewSpotFragmentAdapter);

        return rootView;
    }

}
