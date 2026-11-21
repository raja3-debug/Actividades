package com.example.miaplicacin;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DialogoActivity extends AppCompatActivity  implements View.OnClickListener{
    Button boton1,boton2;
    String DiasSemana[] ={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    Toast toast ;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_mensajes);
        //Toast.setGravity(Gravity.CENTER|Gravity.START, 0, 0);
       boton1 =(Button) findViewById(R.id.btn1);
       boton2 =(Button) findViewById(R.id.btn2);
       boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int DialogInterface;
        Object dialog;
        int id = v.getId();

        if (id == R.id.btn1){
            AlertDialog.Builder builder1 = new AlertDialog.Builder(DialogoActivity.this);

                    builder1.setTitle("Dialgo con Botones")
                    .setIcon(R.mipmap.ic_launcher)
                    .setNeutralButton("Boton 1", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(),
                                    "Has pulsado el primer boton",
                                    Toast.LENGTH_LONG).show();


                        }
                    }).setNegativeButton("Boton 2", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(),
                                    "Has pulsado el segundo boton",
                                    Toast.LENGTH_LONG).show();
                        }
                    }).setPositiveButton("Boton 3", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(),
                                    "Has pulsado el tercer boton",
                                    Toast.LENGTH_LONG).show();
                        }
                    });
            builder1.create().show();


        } else if (id == R.id.btn2){
            AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogoActivity.this);

            builder2.setTitle("Dialgo con la lista de dias de la semana")
                    .setIcon(R.mipmap.ic_launcher)
                    .setItems(DiasSemana, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String mensaje="has pulsado "+DiasSemana[which];
                            Toast.makeText(getApplicationContext(),
                                    mensaje,
                                    Toast.LENGTH_LONG).show();
                        }
                    });
            builder2.create().show();



        }


    }
}
