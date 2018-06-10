package com.example.a11120029.hanyapp.tour3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food3.boyung;
import com.example.a11120029.hanyapp.food3.docgae;
import com.example.a11120029.hanyapp.food3.dolharbangg;

public class hanrim extends AppCompatActivity {

    ImageButton ib49, ib50, ib51, ib52, ib53, ib54;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hanrim);

        ib49 = (ImageButton) findViewById(R.id.Ib49);
        ib49.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent49 = new Intent(hanrim.this, hyup.class);
                startActivity(intent49);
            }
        });

        ib50 = (ImageButton) findViewById(R.id.Ib50);
        ib50.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent50 = new Intent(hanrim.this, minsok.class);
                startActivity(intent50);
            }
        });

        ib51 = (ImageButton) findViewById(R.id.Ib51);
        ib51.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent51 = new Intent(hanrim.this, jejumuseum.class);
                startActivity(intent51);
            }
        });

        ib52 = (ImageButton) findViewById(R.id.Ib52);
        ib52.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent52 = new Intent(hanrim.this, boyung.class);
                startActivity(intent52);
            }
        });

        ib53 = (ImageButton) findViewById(R.id.Ib53);
        ib53.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent53 = new Intent(hanrim.this, docgae.class);
                startActivity(intent53);
            }
        });

        ib54 = (ImageButton) findViewById(R.id.Ib54);
        ib54.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent54 = new Intent(hanrim.this, dolharbangg.class);
                startActivity(intent54);
            }
        });
    }
}
