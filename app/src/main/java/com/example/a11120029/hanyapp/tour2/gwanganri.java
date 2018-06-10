package com.example.a11120029.hanyapp.tour2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food.halmae;
import com.example.a11120029.hanyapp.food.sinsen;
import com.example.a11120029.hanyapp.food.soojung;

public class gwanganri extends AppCompatActivity {

    ImageButton ib19, ib20, ib21, ib22 ,ib23, ib24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gwanganri);

        ib19 = (ImageButton) findViewById(R.id.Ib19);
        ib19.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent19 = new Intent(gwanganri.this, thebay.class);
                startActivity(intent19);
            }
        });

        ib20 = (ImageButton) findViewById(R.id.Ib20);
        ib20.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent20 = new Intent(gwanganri.this, park.class);
                startActivity(intent20);
            }
        });

        ib21 = (ImageButton) findViewById(R.id.Ib21);
        ib21.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent21 = new Intent(gwanganri.this, island.class);
                startActivity(intent21);
            }
        });

        ib22 = (ImageButton) findViewById(R.id.Ib22);
        ib22.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent22 = new Intent(gwanganri.this, halmae.class);
                startActivity(intent22);
            }
        });

        ib23 = (ImageButton) findViewById(R.id.Ib23);
        ib23.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent23 = new Intent(gwanganri.this, soojung.class);
                startActivity(intent23);
            }
        });

        ib24 = (ImageButton) findViewById(R.id.Ib24);
        ib24.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent24 = new Intent(gwanganri.this, sinsen.class);
                startActivity(intent24);
            }
        });
    }
}