package com.example.zootour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    ImageButton elebt, leobt, tgrbt, zbabt;

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        elebt = findViewById(R.id.elebtn);
        leobt = findViewById(R.id.leobtn);
        tgrbt = findViewById(R.id.tgrbtn);
        zbabt = findViewById(R.id.zbabtn);

        elebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Elephant.class);
                startActivity(intent);
            }
        });

        leobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Leopard.class);
                startActivity(intent);
            }
        });

        tgrbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Tiger.class);
                startActivity(intent);
            }
        });

        zbabt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Zebra.class);
                startActivity(intent);
            }
        });

    }
}
