package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class rtx36t extends AppCompatActivity {
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtx36t);
        btnInfo = findViewById(R.id.btninfortx36t);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://rog.asus.com/latin/graphics-cards/graphics-cards/rog-strix/rog-strix-rtx3060ti-o8g-v2-gaming-model/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
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
                Intent intent1 = new Intent(rtx36t.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(rtx36t.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}