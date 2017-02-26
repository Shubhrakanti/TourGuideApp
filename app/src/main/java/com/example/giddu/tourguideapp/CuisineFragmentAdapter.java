package com.example.giddu.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by giddu on 2/25/17.
 */

public class CuisineFragmentAdapter extends ArrayAdapter<Cuisine> {

    Context m;

    public CuisineFragmentAdapter(Context context, ArrayList<Cuisine> objects) {
        super(context, 0, objects);
        m = context;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.cuisine_list_item, parent, false);
        }

        Cuisine currentCuisine = getItem(position);

        TextView cuisineNameTextView = (TextView) listItemView.findViewById(R.id.cuisineNameTextView);
        String name = m.getResources().getString(currentCuisine.getName());
        cuisineNameTextView.setText(name);

        TextView numRestaurantsTextView = (TextView) listItemView.findViewById(R.id.numRestTextView);
        numRestaurantsTextView.setText(String.valueOf(currentCuisine.getNumRestaurants()));

        ImageView cuisineImageView = (ImageView) listItemView.findViewById(R.id.cuisineImageView);
        if (currentCuisine.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            cuisineImageView.setImageResource(currentCuisine.getImgResourceID());
            // Make sure the view is visible
            cuisineImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            cuisineImageView.setVisibility(View.GONE);
        }

        return listItemView;

    }


}
