package com.example.a11120029.hanyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.food3.FoodMainActivity3;
import com.example.a11120029.hanyapp.tour3.TourMainActivity3;

/**
 * Created by 11120029 on 2018-05-30.
 */

public class FragJejudo extends AppCompatActivity {

    Button button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragjejudo);

        button2 = (Button) findViewById(R.id.guide_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FragJejudo.this, Pager.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.tour_jeju);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(FragJejudo.this, TourMainActivity3.class);
                startActivity(intent4);
            }
        });

        button4 = (Button) findViewById(R.id.food_button3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(FragJejudo.this, FoodMainActivity3.class);
                startActivity(intent5);
            }
        });

    }
}