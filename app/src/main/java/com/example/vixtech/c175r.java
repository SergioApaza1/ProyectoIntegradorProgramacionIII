package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class c175r extends AppCompatActivity {
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c175r);
        btnInfo = findViewById(R.id.btninfo175r);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.corsair.com/lm/es/Categor%C3%ADas/Productos/Chasis/Chasis-de-semitorre-ATX/Chasis-ATX-semitorre-para-juegos-de-cristal-templado-Carbide-Series-175R-RGB%2C-negro/p/CC-9011171-WW";
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
                Intent intent1 = new Intent(c175r.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(c175r.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}