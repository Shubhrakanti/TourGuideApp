package com.example.giddu.tourguideapp;

/**
 * Created by giddu on 2/25/17.
 */

public class Cuisine {

    private int imgResourceID;
    private int name;
    private int numRestaurants;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Cuisine(int name, int imgResourceID, int numRestaurants) {
        this.name = name;
        this.imgResourceID = imgResourceID;
        this.numRestaurants = numRestaurants;

    }

    public int getName() {
        return name;
    }

    public int getImgResourceID() {
        return imgResourceID;
    }

    public int getNumRestaurants() {
        return numRestaurants;
    }

    public boolean hasImage() {
        return imgResourceID != NO_IMAGE_PROVIDED;
    }



}
