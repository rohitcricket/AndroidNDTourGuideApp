package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();


        TextView restaurants = (TextView)findViewById(R.id.restaurant);

        restaurants.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

    }

    // https://www.mkyong.com/android/android-imagebutton-example/

    public void addListenerOnButton() {

        imageButton = (ImageButton) findViewById(R.id.icon_res);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.zagat.com"));
                startActivity(browserIntent);

            }

        });

    }

}
