package com.example.android.tourguide;

/**
 * Created by rohitgupta on 9/18/16.
 */
public class Hotel {
    private String mHotelName;
    private String mHotelLocation;

    // Constructor
    public Hotel (String hotelName, String hotelLocation){
        mHotelName = hotelName;
        mHotelLocation = hotelLocation;
    }

    // Getters
    public String getNameHotel(){
        return mHotelName;
    }

    public String getHotelLocation() {
        return mHotelLocation;
    }



}
