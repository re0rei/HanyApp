package com.example.a11120029.hanyapp.tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food2.dducssaroong;
import com.example.a11120029.hanyapp.food2.ureok;
import com.example.a11120029.hanyapp.food2.yangbandack;

public class samload extends AppCompatActivity {

    ImageButton ib13, ib14, ib15, ib16 ,ib17, ib18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.samload);

        ib13 = (ImageButton) findViewById(R.id.Ib13);
        ib13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent13 = new Intent(samload.this, traditional.class);
                startActivity(intent13);
            }
        });

        ib14 = (ImageButton) findViewById(R.id.Ib14);
        ib14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent14 = new Intent(samload.this, luxury.class);
                startActivity(intent14);
            }
        });

        ib15 = (ImageButton) findViewById(R.id.Ib15);
        ib15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent15 = new Intent(samload.this, museum.class);
                startActivity(intent15);
            }
        });

        ib16 = (ImageButton) findViewById(R.id.Ib16);
        ib16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent16 = new Intent(samload.this, dducssaroong.class);
                startActivity(intent16);
            }
        });

        ib17 = (ImageButton) findViewById(R.id.Ib17);
        ib17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent17 = new Intent(samload.this, ureok.class);
                startActivity(intent17);
            }
        });

        ib18 = (ImageButton) findViewById(R.id.Ib18);
        ib18.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent18 = new Intent(samload.this, yangbandack.class);
                startActivity(intent18);
            }
        });
    }
}