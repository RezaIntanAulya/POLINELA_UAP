package com.example.wonderfullpolinela;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TernakActivity extends AppCompatActivity {
    CardView card3, card4, card5, card6, card7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ternak);

        card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(TernakActivity.this, TPternakActivity.class);
                startActivity(intent1);
            }
        });

        card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(TernakActivity.this, TPikanActivity.class);
                startActivity(intent2);
            }
        });

        card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(TernakActivity.this, ProduksiternakActivity.class);
                startActivity(intent3);
            }
        });

        card5 = findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(TernakActivity.this, BudidayaperikananActivity.class);
                startActivity(intent4);
            }
        });

        card6 = findViewById(R.id.card6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(TernakActivity.this, PerikanantangkapActivity.class);
                startActivity(intent5);
            }
        });
    }
}