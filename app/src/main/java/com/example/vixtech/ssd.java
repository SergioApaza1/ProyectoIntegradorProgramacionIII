package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ssd extends AppCompatActivity {
    Button btnk240, btnk480, btnk980, btnsc240, btnsc480, btnsc980, btnmc250, btnmc500, btnmc1t, btns250, btns500, btns1t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssd);
        btnk240 = findViewById(R.id.btnk240);
        btnk480 = findViewById(R.id.btnk480);
        btnk980 = findViewById(R.id.btnk980);
        btnsc240 = findViewById(R.id.btnsc240);
        btnsc480 = findViewById(R.id.btnsc480);
        btnsc980 = findViewById(R.id.btnsc980);
        btnmc250 = findViewById(R.id.btnmc250);
        btnmc500 = findViewById(R.id.btnmc500);
        btnmc1t = findViewById(R.id.btnmc1t);
        btns250 = findViewById(R.id.btns250);
        btns500 = findViewById(R.id.btns500);
        btns1t = findViewById(R.id.btns1t);

        btnk240.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,k240.class);
                startActivity(intent);
            }
        });

        btnk480.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,k480.class);
                startActivity(intent);
            }
        });

        btnk980.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,k980.class);
                startActivity(intent);
            }
        });

        btnsc240.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,c240.class);
                startActivity(intent);
            }
        });

        btnsc480.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,c480.class);
                startActivity(intent);
            }
        });

        btnsc980.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,c960.class);
                startActivity(intent);
            }
        });

        btnmc250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,c250.class);
                startActivity(intent);
            }
        });

        btnmc500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,c500.class);
                startActivity(intent);
            }
        });

        btnmc1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,c1t.class);
                startActivity(intent);
            }
        });

        btns250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,s250.class);
                startActivity(intent);
            }
        });

        btns500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,s500.class);
                startActivity(intent);
            }
        });

        btns1t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ssd.this,s1t.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.informacion,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.btnInformacion:
                Intent intent1 = new Intent(ssd.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(ssd.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}