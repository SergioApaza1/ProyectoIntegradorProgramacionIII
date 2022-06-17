package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class psu extends AppCompatActivity {
    Button btncx450, btncx550, btnrm550, btnrm650, btnhx750, btnr750;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psu);
        btncx450 = findViewById(R.id.btncx450);
        btncx550 = findViewById(R.id.btncx550);
        btnrm550 = findViewById(R.id.btnrm550);
        btnrm650 = findViewById(R.id.btnrm650);
        btnhx750 = findViewById(R.id.btnhx750);
        btnr750 = findViewById(R.id.btnrog750);

        btncx450.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(psu.this,cx450.class);
                startActivity(intent);
            }
        });

        btncx550.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(psu.this,cx550.class);
                startActivity(intent);
            }
        });

        btnrm550.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(psu.this,rm550.class);
                startActivity(intent);
            }
        });

        btnrm650.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(psu.this,rm650.class);
                startActivity(intent);
            }
        });

        btnhx750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(psu.this,hx750.class);
                startActivity(intent);
            }
        });

        btnr750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(psu.this,r850.class);
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
                Intent intent1 = new Intent(psu.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(psu.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}