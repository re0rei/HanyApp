package com.example.a11120029.hanyapp.tour3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.a11120029.hanyapp.R;
import com.example.a11120029.hanyapp.food3.blackfig;
import com.example.a11120029.hanyapp.food3.gardenn;
import com.example.a11120029.hanyapp.food3.sooudong;

public class gum extends AppCompatActivity {

    ImageButton ib43, ib44, ib45, ib46 ,ib47 ,ib48;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gum);

        ib43 = (ImageButton) findViewById(R.id.Ib43);
        ib43.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent43 = new Intent(gum.this, udo.class);
                startActivity(intent43);
            }
        });

        ib44 = (ImageButton) findViewById(R.id.Ib44);
        ib44.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent44 = new Intent(gum.this, hago.class);
                startActivity(intent44);
            }
        });

        ib45 = (ImageButton) findViewById(R.id.Ib45);
        ib45.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent45 = new Intent(gum.this, guem.class);
                startActivity(intent45);
            }
        });

        ib46 = (ImageButton) findViewById(R.id.Ib46);
        ib46.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent46 = new Intent(gum.this, gardenn.class);
                startActivity(intent46);
            }
        });

        ib47 = (ImageButton) findViewById(R.id.Ib47);
        ib47.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent47 = new Intent(gum.this, blackfig.class);
                startActivity(intent47);
            }
        });

        ib48 = (ImageButton) findViewById(R.id.Ib48);
        ib48.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent48 = new Intent(gum.this, sooudong.class);
                startActivity(intent48);
            }
        });
    }
}