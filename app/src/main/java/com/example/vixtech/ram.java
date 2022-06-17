package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ram extends AppCompatActivity {
    Button btnc1632, btnc1636, btnc3232, btnc3236, btncr1632, btncr1636, btncr3232, btncr3236;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram);
        btnc1632 = findViewById(R.id.btnc1632);
        btnc1636 = findViewById(R.id.btnc1636);
        btnc3232 = findViewById(R.id.btnc3232);
        btnc3236 = findViewById(R.id.btnc3236);
        btncr1632 = findViewById(R.id.btncr1632);
        btncr1636 = findViewById(R.id.btncr1636);
        btncr3232 = findViewById(R.id.btncr3232);
        btncr3236 = findViewById(R.id.btncr3236);

        btnc1632.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,c1632.class);
                startActivity(intent);
            }
        });

        btnc1636.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,c1636.class);
                startActivity(intent);
            }
        });

        btnc3232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,c3232.class);
                startActivity(intent);
            }
        });

        btnc3236.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,c3236.class);
                startActivity(intent);
            }
        });

        btncr1632.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,cr1632.class);
                startActivity(intent);
            }
        });

        btncr1636.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,cr1636.class);
                startActivity(intent);
            }
        });

        btncr3232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,cr3232.class);
                startActivity(intent);
            }
        });

        btncr3236.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ram.this,cr3236.class);
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
                Intent intent1 = new Intent(ram.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(ram.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}