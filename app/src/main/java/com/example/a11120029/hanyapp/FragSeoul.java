package com.example.a11120029.hanyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.food2.FoodMainActivity2;
import com.example.a11120029.hanyapp.tour.TourMainActivity;

/**
 * Created by 11120029 on 2018-05-30.
 */

public class FragSeoul extends AppCompatActivity {

    Button button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragseoul);

        button2 = (Button) findViewById(R.id.guide_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(FragSeoul.this,Pager.class);
                startActivity(intent3);
            }
        });

        button3 = (Button) findViewById(R.id.tour_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(FragSeoul.this,TourMainActivity.class);
                startActivity(intent5);
            }
        });

        button4 = (Button) findViewById(R.id.food_button2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(FragSeoul.this,FoodMainActivity2.class);
                startActivity(intent6);
            }
        });
    }
}