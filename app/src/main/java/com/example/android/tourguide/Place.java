package com.example.android.tourguide;

/**
 * Created by rohitgupta on 9/11/16.
 */
public class Place {

    private String mNameRestaurant;

    private String mLocationRestaurant;

    // Constructor
    public Place(String nameRestaurant, String locationRestaurant) {
        mNameRestaurant = nameRestaurant;
        mLocationRestaurant = locationRestaurant;
    }

    // Getters
    public String getNameRestaurant() {
        return mNameRestaurant;
    }

    public String getLocationRestaurant() {
        return mLocationRestaurant;
    }


}
