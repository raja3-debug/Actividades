package com.example.miaplicacin;

import android.graphics.Color;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PaisActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    TextView texto;
    ArrayAdapter<String> arr;
    String Paises[]={"España","Francia","Belgica","Holanda","China","Japon","Ingland","Suisa","Mali","Argentina"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View v;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
         list=(ListView) findViewById(R.id.lista);
         texto=(TextView)findViewById(R.id.texto);

        arr = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Paises);
        list.setAdapter(arr);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int posicion=list.getCheckedItemPosition();
        String pais = (String) parent.getItemAtPosition(position);
        String elemento = (String) parent.getAdapter().getItem(position);
        texto.setText(pais);
    }
}
