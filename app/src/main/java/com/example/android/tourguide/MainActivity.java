package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton, imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();


        TextView restaurants = (TextView)findViewById(R.id.restaurant);
        TextView hotels = (TextView)findViewById(R.id.hotel);

        restaurants.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

        hotels.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(hotelIntent);
            }
        });

    }

    // https://www.mkyong.com/android/android-imagebutton-example/

    public void addListenerOnButton() {

        imageButton = (ImageButton) findViewById(R.id.icon_res);
        imageButton2 = (ImageButton) findViewById(R.id.icon_hotel);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.zagat.com"));
                startActivity(browserIntent);

            }

        });

        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tripadvisor.com"));
                startActivity(browserIntent);

            }

        });

    }

}
