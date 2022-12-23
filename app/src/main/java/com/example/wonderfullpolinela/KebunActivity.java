package com.example.wonderfullpolinela;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KebunActivity extends AppCompatActivity {
    CardView card3, card4, card5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebun);

        card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(KebunActivity.this, ProduksiTPActivity.class);
                startActivity(intent1);
            }
        });

        card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(KebunActivity.this, PmipActivity.class);
                startActivity(intent2);
            }
        });

        card5 = findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(KebunActivity.this, KopiActivity.class);
                startActivity(intent3);
            }
        });
    }
}