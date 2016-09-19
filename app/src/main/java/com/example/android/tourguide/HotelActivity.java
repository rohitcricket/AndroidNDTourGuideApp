package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        ArrayList<Hotel> hotels = new ArrayList<Hotel>();

        hotels.add(new Hotel("Westlake Village", "Westlake Village, CA"));
        hotels.add(new Hotel("The Simpsons Inn", "Santa Barbara, CA"));

        //ArrayAdapter<Place> resAdapter = new ArrayAdapter<Place>(this, R.layout.list_restaurant, restaurants);

        HotelAdapter adapter = new HotelAdapter(this, hotels);

        ListView listview = (ListView) findViewById(R.id.list2);
        listview.setAdapter(adapter);



    }
}
