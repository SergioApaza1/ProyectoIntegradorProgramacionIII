package com.example.vixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class i310 extends AppCompatActivity {
    Button btninfoi310;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i310);

        btninfoi310 = findViewById(R.id.btninfoi310);

        btninfoi310.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://ark.intel.com/content/www/es/es/ark/products/203473/intel-core-i310100f-processor-6m-cache-up-to-4-30-ghz.html";
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
                Intent intent1 = new Intent(i310.this, Informacion.class);
                startActivity(intent1);
                return true;
            case R.id.btnCarrito:
                Intent intent2 = new Intent(i310.this, Carrito.class);
                startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}