package com.example.giddu.tourguideapp;

/**
 * Created by giddu on 2/25/17.
 */

public class ViewSpot {

    private int imgResourceID;
    private String name;
    private static final int NO_IMAGE_PROVIDED = -1;

    public ViewSpot(int imgResourceID, String name) {
        this.imgResourceID = imgResourceID;
        this.name = name;
    }

    public int getImgResourceID() {
        return imgResourceID;
    }

    public String getName() {
        return name;
    }

    public boolean hasImage() {
        return imgResourceID != NO_IMAGE_PROVIDED;
    }
}
