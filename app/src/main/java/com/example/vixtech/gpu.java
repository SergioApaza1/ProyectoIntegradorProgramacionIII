package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class gpu extends AppCompatActivity {
    Button btngtx165, btnrtx26, btnrtx35, btnrtx36, btnrtx36t, btnrtx37t, btnrtx38, btnrtx39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpu);
        btngtx165 = findViewById(R.id.btngtx1650s);
        btnrtx26 = findViewById(R.id.btnrtx2060);
        btnrtx35 = findViewById(R.id.btnrtx3050);
        btnrtx36 = findViewById(R.id.btnrtx3060);
        btnrtx36t = findViewById(R.id.btnrtx3060ti);
        btnrtx37t = findViewById(R.id.btnrtx3070);
        btnrtx38 = findViewById(R.id.btnrtx3080);
        btnrtx39 = findViewById(R.id.btnrtx3090);

        btngtx165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,gtx16s.class);
                startActivity(intent);
            }
        });

        btnrtx26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,rtx26.class);
                startActivity(intent);
            }
        });

        btnrtx35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,rtx35.class);
                startActivity(intent);
            }
        });

        btnrtx36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,rtx36.class);
                startActivity(intent);
            }
        });

        btnrtx36t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,rtx36t.class);
                startActivity(intent);
            }
        });

        btnrtx37t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,rtx37.class);
                startActivity(intent);
            }
        });

        btnrtx38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,rtx38.class);
                startActivity(intent);
            }
        });

        btnrtx39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(gpu.this,rtx39.class);
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
                Intent intent1 = new Intent(gpu.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(gpu.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}