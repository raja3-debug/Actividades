package com.example.miaplicacin;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        texto = findViewById(R.id.texto);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (!item.hasSubMenu()) {
            String nombreElemento = item.getTitle().toString();
            texto.setText("Seleccionado: " + nombreElemento);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
