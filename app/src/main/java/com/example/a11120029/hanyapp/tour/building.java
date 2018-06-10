package com.example.a11120029.hanyapp.tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food2.backrihyang;
import com.example.a11120029.hanyapp.food2.pavilion;
import com.example.a11120029.hanyapp.food2.shuciku;

public class building extends AppCompatActivity {

    ImageButton ib7, ib8, ib9, ib10 ,ib11, ib12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building);

        ib7 = (ImageButton) findViewById(R.id.Ib7);
        ib7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent7 = new Intent(building.this, marinabote.class);
                startActivity(intent7);
            }
        });

        ib8 = (ImageButton) findViewById(R.id.Ib8);
        ib8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent8 = new Intent(building.this, yungsanarthall.class);
                startActivity(intent8);
            }
        });

        ib9 = (ImageButton) findViewById(R.id.Ib9);
        ib9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent9 = new Intent(building.this, aquaplanet.class);
                startActivity(intent9);
            }
        });

        ib10 = (ImageButton) findViewById(R.id.Ib10);
        ib10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent10 = new Intent(building.this, backrihyang.class);
                startActivity(intent10);
            }
        });

        ib11 = (ImageButton) findViewById(R.id.Ib11);
        ib11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent11 = new Intent(building.this, shuciku.class);
                startActivity(intent11);
            }
        });

        ib12 = (ImageButton) findViewById(R.id.Ib12);
        ib12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent12 = new Intent(building.this, pavilion.class);
                startActivity(intent12);
            }
        });
    }
}