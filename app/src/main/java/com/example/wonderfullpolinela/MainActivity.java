package com.example.wonderfullpolinela;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity  extends AppCompatActivity{
    CardView cvPangan, cvKebun, cvTektan, cvTernak, cvEkbis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvPangan = findViewById(R.id.cvPangan);
        cvPangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, PanganActivity.class);
                startActivity(intent1);
            }
        });

        cvKebun = findViewById(R.id.cvKebun);
        cvKebun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, KebunActivity.class);
                startActivity(intent2);
            }
        });

        cvTektan = findViewById(R.id.cvTektan);
        cvTektan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, TektanActivity.class);
                startActivity(intent3);
            }
        });

        cvTernak = findViewById(R.id.cvTernak);
        cvTernak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, TernakActivity.class);
                startActivity(intent4);
            }
        });

        cvEkbis = findViewById(R.id.cvEkbis);
        cvEkbis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, EkbisActivity.class);
                startActivity(intent5);
            }
        });
    }
}