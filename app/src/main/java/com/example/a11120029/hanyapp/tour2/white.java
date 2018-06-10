package com.example.a11120029.hanyapp.tour2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food.junju;
import com.example.a11120029.hanyapp.food.mokjang;
import com.example.a11120029.hanyapp.food.taejongjjam;

public class white extends AppCompatActivity {

    ImageButton ib25, ib26, ib27, ib28 ,ib29, ib30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.white);

        ib25 = (ImageButton) findViewById(R.id.Ib25);
        ib25.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent25 = new Intent(white.this, taejong.class);
                startActivity(intent25);
            }
        });

        ib26 = (ImageButton) findViewById(R.id.Ib26);
        ib26.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent26 = new Intent(white.this, seamuseum.class);
                startActivity(intent26);
            }
        });

        ib27 = (ImageButton) findViewById(R.id.Ib27);
        ib27.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent27 = new Intent(white.this, songdo.class);
                startActivity(intent27);
            }
        });

        ib28 = (ImageButton) findViewById(R.id.Ib28);
        ib28.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent28 = new Intent(white.this, taejongjjam.class);
                startActivity(intent28);
            }
        });

        ib29 = (ImageButton) findViewById(R.id.Ib29);
        ib29.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent29 = new Intent(white.this, junju.class);
                startActivity(intent29);
            }
        });

        ib30 = (ImageButton) findViewById(R.id.Ib30);
        ib30.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent30 = new Intent(white.this, mokjang.class);
                startActivity(intent30);
            }
        });
    }
}