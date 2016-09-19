package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rohitgupta on 9/18/16.
 */
public class HotelAdapter extends ArrayAdapter<Hotel> {

    private static final String LOG_TAG = HotelAdapter.class.getSimpleName();

    public HotelAdapter(Activity context, ArrayList<Hotel> hotels) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, hotels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_hotel, parent, false);
        }


        // Get the {@link ReportCard} object located at this position in the list
        Hotel currentHotel = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID name_restaurant
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_hotel);

        // Get the student name from the current ReportCard object and
        // set this text on the name TextView
        nameTextView.setText(currentHotel.getNameHotel());


        // Find the TextView in the list_item.xml layout with the ID location_restaurant
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.location_hotel);

        // Get the grade from the current ReportCard object and
        // set this text on the number TextView
        numberTextView.setText(currentHotel.getHotelLocation());

        return listItemView;
    }


}
