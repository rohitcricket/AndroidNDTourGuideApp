package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ArrayList<Place> restaurants = new ArrayList<Place>();

        restaurants.add(new Place("The Landing Grill & Sushi", "Westlake Village, CA"));
        restaurants.add(new Place("Kobe Restaurant", "Santa Clara, CA"));

        //ArrayAdapter<Place> resAdapter = new ArrayAdapter<Place>(this, R.layout.list_restaurant, restaurants);

        PlaceAdapter adapter = new PlaceAdapter(this, restaurants);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);


    }
}
