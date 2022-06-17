package com.example.vixtech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menuPrincipal extends AppCompatActivity {
    Button btnProcesador, btnTarjetaMadre, btnTarjetaGrafica, btnRam, btnSsd, btnHdd, btnCooler, btnCases, btnPsu, btnMonitor, btnMouse, btnTeclado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnProcesador = findViewById(R.id.btnProcesador);
        btnTarjetaMadre = findViewById(R.id.btnTarjetaMadre);
        btnTarjetaGrafica = findViewById(R.id.btnTarjetaVideo);
        btnRam = findViewById(R.id.btnRAM);
        btnSsd = findViewById(R.id.btnSSD);
        btnHdd = findViewById(R.id.btnHDD);
        btnCooler = findViewById(R.id.btnRefrigeracion);
        btnCases = findViewById(R.id.btnCases);
        btnPsu = findViewById(R.id.btnPSU);
        btnMonitor = findViewById(R.id.btnMonitor);
        btnMouse = findViewById(R.id.btnMouse);
        btnTeclado = findViewById(R.id.btnTeclado);

        btnProcesador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this,CPU.class);
                startActivity(intent);
            }
        });

        btnTarjetaMadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, mb.class);
                startActivity(intent);
            }
        });

        btnTarjetaGrafica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, gpu.class);
                startActivity(intent);
            }
        });

        btnRam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, ram.class);
                startActivity(intent);
            }
        });

        btnSsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, ssd.class);
                startActivity(intent);
            }
        });

        btnHdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, hdd.class);
                startActivity(intent);
            }
        });

        btnCooler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, cooler.class);
                startActivity(intent);
            }
        });

        btnCases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, cases.class);
                startActivity(intent);
            }
        });

        btnPsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, psu.class);
                startActivity(intent);
            }
        });

        btnMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, monitor.class);
                startActivity(intent);
            }
        });

        btnMouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, mouse.class);
                startActivity(intent);
            }
        });

        btnTeclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuPrincipal.this, teclado.class);
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
                Intent intent1 = new Intent(menuPrincipal.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(menuPrincipal.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}