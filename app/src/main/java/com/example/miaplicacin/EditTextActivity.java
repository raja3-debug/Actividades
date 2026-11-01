package com.example.miaplicacin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.Duration;

public class EditTextActivity extends AppCompatActivity  implements View.OnClickListener {
    Button saludar;
    EditText editText;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

         editText = findViewById(R.id.edit_text);
         editText.setText("Escribe tu nombre");
         saludar = (Button) findViewById(R.id.ButtonSaludar);
        saludar.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        if(view.getId() == R.id.ButtonSaludar){
            String textEscrito=editText.getText().toString();

            Toast.makeText(EditTextActivity.this, "Hola: " + textEscrito, Toast.LENGTH_SHORT).show();

        }
    }



}
