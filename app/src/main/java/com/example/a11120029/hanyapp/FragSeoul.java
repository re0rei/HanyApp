package com.example.a11120029.hanyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by 11120029 on 2018-05-30.
 */

public class FragSeoul extends AppCompatActivity {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragseoul);

        button2 = (Button) findViewById(R.id.guide_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(FragSeoul.this,Pager.class);
                startActivity(intent3);
            }
        });

    }
}