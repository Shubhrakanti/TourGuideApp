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
public class OutdoorFragment extends Fragment {


    ListView sightsView;
    ArrayList<ViewSpot> sightsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.viewspot_list, container, false);

        sightsList = new ArrayList<>();
        sightsList.add(new ViewSpot(R.drawable.muir_woods, R.string.muir));




        ViewSpotFragmentAdapter viewSpotFragmentAdapter = new ViewSpotFragmentAdapter(getContext(), sightsList);


        sightsView = (ListView) rootView.findViewById(R.id.viewSpotListView);
        sightsView.setAdapter(viewSpotFragmentAdapter);

        return rootView;
    }

}
