package com.example.miaplicacin;



import android.graphics.Color;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class ButtonActivity1 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity1);
        }
        public void pulsado (View view){
            Button button1=(Button) findViewById(R.id.Button1);
            button1.setText("BUTTON PULSADO");
            button1.setTextColor(Color.RED);

        }

    }

