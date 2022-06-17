package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CPU extends AppCompatActivity {
    Button btnPentium, btnAthlon, btni310, btnr331, btni311, btnr33x, btni510, btnr36, btni511, btnr56g, btni512, btnr56x, btni312, btni512k, btni712k, btnr75x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu);
        btnPentium = findViewById(R.id.btnpentium);
        btnAthlon = findViewById(R.id.btnathlon);
        btni310 = findViewById(R.id.btni310);
        btnr331 = findViewById(R.id.btnr331);
        btni311 = findViewById(R.id.btni311);
        btnr33x = findViewById(R.id.btnr33x);
        btni510 = findViewById(R.id.btni510);
        btnr36 = findViewById(R.id.btnr536);
        btni511 = findViewById(R.id.btni511);
        btnr56g = findViewById(R.id.btnr56g);
        btni512 = findViewById(R.id.btni512);
        btnr56x = findViewById(R.id.btnr56x);
        btni312 = findViewById(R.id.btni312);
        btni512k = findViewById(R.id.btni512k);
        btni712k = findViewById(R.id.btni712k);
        btnr75x = findViewById(R.id.btnr758x);

        btnPentium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,pentiumG6405.class);
                startActivity(intent);
            }
        });

        btnAthlon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,athlon.class);
                startActivity(intent);
            }
        });

        btni310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i310.class);
                startActivity(intent);
            }
        });

        btnr331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,r331.class);
                startActivity(intent);
            }
        });

        btni311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i311.class);
                startActivity(intent);
            }
        });

        btnr33x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,r333x.class);
                startActivity(intent);
            }
        });

        btni510.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i510.class);
                startActivity(intent);
            }
        });

        btnr36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,r536.class);
                startActivity(intent);
            }
        });

        btni511.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i511.class);
                startActivity(intent);
            }
        });

        btnr56g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,r56g.class);
                startActivity(intent);
            }
        });

        btni512.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i512.class);
                startActivity(intent);
            }
        });

        btnr56x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,r56x.class);
                startActivity(intent);
            }
        });

        btni312.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i312.class);
                startActivity(intent);
            }
        });

        btni512k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i512k.class);
                startActivity(intent);
            }
        });

        btni712k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,i712.class);
                startActivity(intent);
            }
        });

        btnr75x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CPU.this,r758x.class);
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
                Intent intent1 = new Intent(CPU.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(CPU.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}