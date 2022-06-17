package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class mb extends AppCompatActivity {
    Button btnh510, btna320, btnh610, btna520, btnb460m, btnb450m, btnb460f, btnb550f, btnb660f, btnx570, btnz490, btnz690;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mb);
        btnh510 = findViewById(R.id.btnh510);
        btna320 = findViewById(R.id.btna320);
        btnh610 = findViewById(R.id.btnh610);
        btna520 = findViewById(R.id.btna520);
        btnb460m = findViewById(R.id.btnb460);
        btnb450m = findViewById(R.id.btnb450);
        btnb460f = findViewById(R.id.btnb460r);
        btnb550f = findViewById(R.id.btnb550r);
        btnb660f = findViewById(R.id.btnb660r);
        btnx570 = findViewById(R.id.btnx570f);
        btnz490 = findViewById(R.id.btnz490);
        btnz690 = findViewById(R.id.btnz690);

        btnh510.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,h510.class);
                startActivity(intent);
            }
        });

        btna320.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,a320.class);
                startActivity(intent);
            }
        });

        btnh610.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,h610.class);
                startActivity(intent);
            }
        });

        btna520.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,a520.class);
                startActivity(intent);
            }
        });

        btnb460m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,b460.class);
                startActivity(intent);
            }
        });

        btnb450m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,b450.class);
                startActivity(intent);
            }
        });

        btnb460f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,b460f.class);
                startActivity(intent);
            }
        });

        btnb550f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,b550.class);
                startActivity(intent);
            }
        });

        btnb660f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,b660.class);
                startActivity(intent);
            }
        });

        btnx570.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,x570.class);
                startActivity(intent);
            }
        });

        btnz490.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,z490.class);
                startActivity(intent);
            }
        });

        btnz690.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mb.this,z690.class);
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
                Intent intent1 = new Intent(mb.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(mb.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}