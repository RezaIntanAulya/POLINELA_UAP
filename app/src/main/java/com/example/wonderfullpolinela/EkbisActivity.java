package com.example.wonderfullpolinela;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkbisActivity extends AppCompatActivity {
    CardView card3, card4, card5, card6, card7, card8, card9, card10, card11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekbis);

        card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(EkbisActivity.this, Admperpajakan.class);
                startActivity(intent1);
            }
        });

        card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(EkbisActivity.this, MIActivity.class);
                startActivity(intent2);
            }
        });

        card5 = findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(EkbisActivity.this, PWActivity.class);
                startActivity(intent3);
            }
        });

        card6 = findViewById(R.id.card6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(EkbisActivity.this, AGBPActivity.class);
                startActivity(intent4);
            }
        });

        card7 = findViewById(R.id.card7);
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(EkbisActivity.this, pajakActivity.class);
                startActivity(intent5);
            }
        });
        card8 = findViewById(R.id.card8);
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(EkbisActivity.this, ABGActivity.class);
                startActivity(intent6);
            }
        });

        card9 = findViewById(R.id.card9);
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(EkbisActivity.this, PerhotelanActivity.class);
                startActivity(intent7);
            }
        });

        card10 = findViewById(R.id.card10);
        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(EkbisActivity.this, TRIActivity.class);
                startActivity(intent8);
            }
        });

        card11 = findViewById(R.id.card11);
        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(EkbisActivity.this, PengelolaanAgribisnis.class);
                startActivity(intent9);
            }
        });
    }
}