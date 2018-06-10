package com.example.a11120029.hanyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.a11120029.hanyapp.food.FoodMainActivity;
import com.example.a11120029.hanyapp.tour2.TourMainActivity2;
import com.example.a11120029.hanyapp.weather.WMainActivity;

/**
 * Created by 11120029 on 2018-05-30.
 */

public class FragBusan extends AppCompatActivity {

    Button button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragbusan);

        button2 = (Button) findViewById(R.id.guide_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(FragBusan.this, Pager.class);
                startActivity(intent3);
            }
        });

        button3 = (Button) findViewById(R.id.tour2_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(FragBusan.this, TourMainActivity2.class);
                startActivity(intent4);
            }
        });

        button4 = (Button) findViewById(R.id.weather_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(FragBusan.this, WMainActivity.class);
                startActivity(intent5);
            }
        });

        button5 = (Button) findViewById(R.id.food_button);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(FragBusan.this, FoodMainActivity.class);
                startActivity(intent6);
            }
        });
    }
}