package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class mouse extends AppCompatActivity {
    Button btng203, btnviperm, btnharpoon, btniron, btng502, btnviper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouse);
        btng203 = findViewById(R.id.btng203);
        btnviperm = findViewById(R.id.btnvipermini);
        btnharpoon = findViewById(R.id.btnharpoon);
        btniron = findViewById(R.id.btnironclaw);
        btng502 = findViewById(R.id.btng502);
        btnviper = findViewById(R.id.btnviper8k);

        btng203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mouse.this,g203.class);
                startActivity(intent);
            }
        });

        btnviperm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mouse.this,viperm.class);
                startActivity(intent);
            }
        });

        btnharpoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mouse.this,harpoon.class);
                startActivity(intent);
            }
        });

        btniron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mouse.this,iron.class);
                startActivity(intent);
            }
        });

        btng502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mouse.this,g502.class);
                startActivity(intent);
            }
        });

        btnviper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mouse.this,viper.class);
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
                Intent intent1 = new Intent(mouse.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(mouse.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}