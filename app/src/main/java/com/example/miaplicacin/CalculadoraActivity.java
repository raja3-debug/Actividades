package com.example.miaplicacin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.security.cert.Extension;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textoPantalla;
    View view;
    int numero1 = 0;
    String operacion = "";
    String cadenaOperacion="";
    Button buton1,buton2,buton3,buton4,buton5,buton6,buton7,buton8,buton9;
    Button buton0,butonSuma,butonPunto,butonResta,butonDiv,butonMultip,butonResultado,butonActualiza,butonBorrar;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        textoPantalla=findViewById(R.id.numeros);
        butonPunto=findViewById(R.id.btnPunto);
        buton1=findViewById(R.id.btn1);
        buton2=findViewById(R.id.btn2);
        buton3=findViewById(R.id.btn3);
        buton4=findViewById(R.id.btn4);
        buton5=findViewById(R.id.btn5);
        buton6=findViewById(R.id.btn6);
        buton7=findViewById(R.id.btn7);
        buton8=findViewById(R.id.btn8);
        buton9=findViewById(R.id.btn9);
        buton0=findViewById(R.id.btn0);
        butonSuma=findViewById(R.id.btnSuma);
        butonResta=findViewById(R.id.btnResta);
        butonDiv=findViewById(R.id.btnDivision);
        butonMultip=findViewById(R.id.btnMultiplicacion);
        butonResultado=findViewById(R.id.btnResultado);
        butonActualiza=findViewById(R.id.btnActualizar);
        butonBorrar=findViewById(R.id.btnx);
        buton0.setOnClickListener(this);
        buton1.setOnClickListener(this);
        buton2.setOnClickListener(this);
        buton3.setOnClickListener(this);
        buton4.setOnClickListener(this);
        buton5.setOnClickListener(this);
        buton6.setOnClickListener(this);
        buton7.setOnClickListener(this);
        buton8.setOnClickListener(this);
        buton9.setOnClickListener(this);
        butonSuma.setOnClickListener(this);
        butonResta.setOnClickListener(this);
        butonMultip.setOnClickListener(this);
        butonDiv.setOnClickListener(this);
        butonActualiza.setOnClickListener(this);
        butonResultado.setOnClickListener(this);
        butonBorrar.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id == R.id.btn0) {
            cadenaOperacion+="0";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn1) {
            cadenaOperacion+="1";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn2) {
            cadenaOperacion+="2";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn3) {
            cadenaOperacion+="3";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn4) {
            cadenaOperacion+="4";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn5) {
            cadenaOperacion+="5";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn6) {
            cadenaOperacion+="6";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn7) {
            cadenaOperacion+="7";
            textoPantalla.setText(cadenaOperacion);

        } else if (id == R.id.btn8) {
            cadenaOperacion+="8";
            textoPantalla.setText(cadenaOperacion);
        } else if (id == R.id.btn9) {
            cadenaOperacion+="9";
            textoPantalla.setText(cadenaOperacion);

        } else if (id==R.id.btnActualizar) {
         textoPantalla.setText("");
         numero1=0;
         operacion="";
         
     } else if (id==R.id.btnSuma) {
         numero1=Integer.parseInt(cadenaOperacion);
         operacion="+";
         cadenaOperacion+="+";
         textoPantalla.setText(cadenaOperacion);
     } else if (id==R.id.btnResta) {
         numero1=Integer.parseInt(cadenaOperacion);
         operacion="-";
         cadenaOperacion+="-";
         textoPantalla.setText(cadenaOperacion);
         
     } else if (id==R.id.btnMultiplicacion) {
         numero1 = Integer.parseInt(cadenaOperacion);
         operacion = "*";
         cadenaOperacion+="*";
         textoPantalla.setText(cadenaOperacion);

     } else if (id==R.id.btnDivision) {
      numero1=Integer.parseInt(cadenaOperacion);
      operacion="/";
      cadenaOperacion+="/";
      textoPantalla.setText(cadenaOperacion);

     } else if (id==R.id.btnResultado) {
         int numero2=Integer.parseInt(textoPantalla.getText().toString());
         int resultado=0;gi
         if(operacion.equals("+")){
             resultado=numero1+numero2;

         } else if (operacion.equals("-")) {
             resultado=numero1-numero2;

         } else if (operacion.equals("*")) {
             resultado=numero1*numero2;

         } else if (operacion.equals("/")) {
             if(numero2!=0){
                 resultado=numero1/numero2;
             }else {
                 textoPantalla.setText("Error");
             }

         }
         textoPantalla.setText(String.valueOf(resultado));

     }


    }


}
