package com.example.a11120029.hanyapp.tour2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food.hanyang;
import com.example.a11120029.hanyapp.food.sahaebang;
import com.example.a11120029.hanyapp.food.yedang;

public class market extends AppCompatActivity {

    ImageButton ib31, ib32, ib33, ib34 ,ib35 ,ib36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.market);

        ib31 = (ImageButton) findViewById(R.id.Ib31);
        ib31.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent31 = new Intent(market.this, book.class);
                startActivity(intent31);
            }
        });

        ib32 = (ImageButton) findViewById(R.id.Ib32);
        ib32.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent32 = new Intent(market.this, ydtower.class);
                startActivity(intent32);
            }
        });

        ib33 = (ImageButton) findViewById(R.id.Ib33);
        ib33.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent33 = new Intent(market.this, biff.class);
                startActivity(intent33);
            }
        });

        ib34 = (ImageButton) findViewById(R.id.Ib34);
        ib34.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent34 = new Intent(market.this, yedang.class);
                startActivity(intent34);
            }
        });

        ib35 = (ImageButton) findViewById(R.id.Ib35);
        ib35.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent35 = new Intent(market.this, sahaebang.class);
                startActivity(intent35);
            }
        });

        ib36 = (ImageButton) findViewById(R.id.Ib36);
        ib36.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent36 = new Intent(market.this, hanyang.class);
                startActivity(intent36);
            }
        });
    }
}