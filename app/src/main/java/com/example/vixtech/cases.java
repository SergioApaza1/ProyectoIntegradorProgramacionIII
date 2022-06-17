package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class cases extends AppCompatActivity {
    Button btn175r, btn275r, btn4000d, btn4000x, btnmb520, btngt501;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cases);
        btn175r = findViewById(R.id.btn175r);
        btn275r = findViewById(R.id.btn275r);
        btn4000d = findViewById(R.id.btn4000d);
        btn4000x = findViewById(R.id.btn4000x);
        btnmb520 = findViewById(R.id.btnmb520);
        btngt501 = findViewById(R.id.btngt501);

        btn175r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cases.this,c175r.class);
                startActivity(intent);
            }
        });

        btn275r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cases.this,c275r.class);
                startActivity(intent);
            }
        });

        btn4000d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cases.this,c4000d.class);
                startActivity(intent);
            }
        });

        btn4000x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cases.this,c4000x.class);
                startActivity(intent);
            }
        });

        btnmb520.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cases.this,mb520.class);
                startActivity(intent);
            }
        });

        btngt501.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cases.this,gt501.class);
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
                Intent intent1 = new Intent(cases.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(cases.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}