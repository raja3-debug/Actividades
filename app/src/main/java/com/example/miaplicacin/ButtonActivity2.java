package com.example.miaplicacin;

import android.graphics.Color;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.security.cert.Extension;

    public class ButtonActivity2 extends AppCompatActivity implements View.OnClickListener{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_button);
            Button button=(Button) findViewById(R.id.Button1);
            button.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Extension view = null;
            if(v.getId() == R.id.Button1){
                Button button1=(Button) v;

                // button1.setTextColor(Color.RED);
                if(button1.getTextColors().getDefaultColor()==Color.RED){
                    button1.setText("BUTTON 2 PULSADO");
                    button1.setTextColor(Color.GREEN);
                } else  {
                    button1.setText("BUTTON 1 PULSADO");
                    button1.setTextColor(Color.RED);
                }

            }


        }
    }

