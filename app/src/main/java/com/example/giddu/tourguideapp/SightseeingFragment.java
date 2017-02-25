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
        sightsList.add(new ViewSpot(R.drawable.alcatraz, "Alcatraz"));
        sightsList.add(new ViewSpot(R.drawable.chinatown, "Chinatown"));
        sightsList.add(new ViewSpot(R.drawable.golden_gate_bridge, "Golden Gate Bridge"));
        sightsList.add(new ViewSpot(R.drawable.pier_39, "Pier 39"));
        sightsList.add(new ViewSpot(R.drawable.fisherman_s_wharf, "" + "Fisherman's Wharf"));
        sightsList.add(new ViewSpot(R.drawable.lombard_street, "Lombard Street"));
        sightsList.add(new ViewSpot(R.drawable.aquaruim_of_the_bay, "Aquarium of the Bay"));



        ViewSpotFragmentAdapter viewSpotFragmentAdapter = new ViewSpotFragmentAdapter(getContext(), sightsList);


        sightsView = (ListView) rootView.findViewById(R.id.viewSpotListView);
        sightsView.setAdapter(viewSpotFragmentAdapter);

        return rootView;
    }

}
