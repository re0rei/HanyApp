package com.example.a11120029.hanyapp.tour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food2.chotbool;
import com.example.a11120029.hanyapp.food2.dining;
import com.example.a11120029.hanyapp.food2.hancook;

public class seoultower extends AppCompatActivity {

    ImageButton ib1, ib2, ib3, ib4 ,ib5, ib6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seoultower);

        ib1 = (ImageButton) findViewById(R.id.Ib1);
        ib1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent1 = new Intent(seoultower.this, cablecar.class);
                startActivity(intent1);
            }
        });

        ib2 = (ImageButton) findViewById(R.id.Ib2);
        ib2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent2 = new Intent(seoultower.this, eight.class);
                startActivity(intent2);
            }
        });

        ib3 = (ImageButton) findViewById(R.id.Ib3);
        ib3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent3 = new Intent(seoultower.this, tratest.class);
                startActivity(intent3);
            }
        });

        ib4 = (ImageButton) findViewById(R.id.Ib4);
        ib4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent4 = new Intent(seoultower.this, hancook.class);
                startActivity(intent4);
            }
        });

        ib5 = (ImageButton) findViewById(R.id.Ib5);
        ib5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent5 = new Intent(seoultower.this, dining.class);
                startActivity(intent5);
            }
        });

        ib6 = (ImageButton) findViewById(R.id.Ib6);
        ib6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent6 = new Intent(seoultower.this, chotbool.class);
                startActivity(intent6);
            }
        });
    }
}