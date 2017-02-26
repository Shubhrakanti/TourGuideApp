package com.example.giddu.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SightseeingFragment extends Fragment {

    ListView sightsView;
    ArrayList<ViewSpot> sightsList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.viewspot_list, container, false);

        sightsList = new ArrayList<>();
        sightsList.add(new ViewSpot(R.drawable.alcatraz, R.string.alcatraz));
        sightsList.add(new ViewSpot(R.drawable.chinatown, R.string.chinatown));
        sightsList.add(new ViewSpot(R.drawable.golden_gate_bridge, R.string.chinatown));
        sightsList.add(new ViewSpot(R.drawable.pier_39, R.string.pier39));
        sightsList.add(new ViewSpot(R.drawable.fisherman_s_wharf, R.string.fisherman));
        sightsList.add(new ViewSpot(R.drawable.lombard_street, R.string.lombard));
        sightsList.add(new ViewSpot(R.drawable.aquaruim_of_the_bay, R.string.aqofbay));



        ViewSpotFragmentAdapter viewSpotFragmentAdapter = new ViewSpotFragmentAdapter(getContext(), sightsList);


        sightsView = (ListView) rootView.findViewById(R.id.viewSpotListView);
        sightsView.setAdapter(viewSpotFragmentAdapter);

        return rootView;
    }

}
