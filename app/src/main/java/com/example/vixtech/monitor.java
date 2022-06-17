package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class monitor extends AppCompatActivity {
    Button btns24, btns27, btna24, btna27,btnm27, btnr24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);
        btns24 = findViewById(R.id.btns24);
        btns27 = findViewById(R.id.btns27);
        btna24 = findViewById(R.id.btna24);
        btna27 = findViewById(R.id.btna27);
        btnm27 = findViewById(R.id.btnmsi27);
        btnr24 = findViewById(R.id.btnrog24);

        btns24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor.this,s24.class);
                startActivity(intent);
            }
        });

        btns27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor.this,s27.class);
                startActivity(intent);
            }
        });

        btna24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor.this,a24.class);
                startActivity(intent);
            }
        });

        btna27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor.this,a27.class);
                startActivity(intent);
            }
        });

        btnm27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor.this,m27.class);
                startActivity(intent);
            }
        });

        btnr24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor.this,r24.class);
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
                Intent intent1 = new Intent(monitor.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(monitor.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}