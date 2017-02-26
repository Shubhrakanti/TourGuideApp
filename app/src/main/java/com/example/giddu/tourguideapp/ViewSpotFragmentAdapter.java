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

public class ViewSpotFragmentAdapter extends ArrayAdapter<ViewSpot> {

    Context m;

    public ViewSpotFragmentAdapter(Context context, ArrayList<ViewSpot> objects) {
        super(context, 0, objects);
        m = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.viewspot_list_item, parent, false);
        }

        ViewSpot currentViewSpot = getItem(position);

        TextView viewSpotNameTextView = (TextView) listItemView.findViewById(R.id.viewspotNameTextView);
        String name = m.getResources().getString(currentViewSpot.getName());
        viewSpotNameTextView.setText(name);

        ImageView viewSpotImageView = (ImageView) listItemView.findViewById(R.id.viewspotImageView);
        if (currentViewSpot.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            viewSpotImageView.setImageResource(currentViewSpot.getImgResourceID());
            // Make sure the view is visible
            viewSpotImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            viewSpotImageView.setVisibility(View.GONE);
        }

        return listItemView;

    }
}
