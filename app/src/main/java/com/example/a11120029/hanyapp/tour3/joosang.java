package com.example.a11120029.hanyapp.tour3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food3.blackrest;
import com.example.a11120029.hanyapp.food3.buphwan;
import com.example.a11120029.hanyapp.food3.saesum;

public class joosang extends AppCompatActivity {

    ImageButton ib37, ib38, ib39, ib40 ,ib41 ,ib42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joosang);

        ib37 = (ImageButton) findViewById(R.id.Ib37);
        ib37.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent37 = new Intent(joosang.this, chun.class);
                startActivity(intent37);
            }
        });

        ib38 = (ImageButton) findViewById(R.id.Ib38);
        ib38.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent38 = new Intent(joosang.this, ggac.class);
                startActivity(intent38);
            }
        });

        ib39 = (ImageButton) findViewById(R.id.Ib39);
        ib39.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent39 = new Intent(joosang.this, sub.class);
                startActivity(intent39);
            }
        });

        ib40 = (ImageButton) findViewById(R.id.Ib40);
        ib40.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent40 = new Intent(joosang.this, buphwan.class);
                startActivity(intent40);
            }
        });

        ib41 = (ImageButton) findViewById(R.id.Ib41);
        ib41.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent41 = new Intent(joosang.this, blackrest.class);
                startActivity(intent41);
            }
        });

        ib42 = (ImageButton) findViewById(R.id.Ib42);
        ib42.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent42 = new Intent(joosang.this, saesum.class);
                startActivity(intent42);
            }
        });

    }
}