package com.example.miaplicacin;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class CalendarioActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton1, boton2;
    int anyo, mes, dia, hora, minuto;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        //Toast.setGravity(Gravity.CENTER|Gravity.START, 0, 0);
        boton1 = (Button) findViewById(R.id.btn1);
        boton2 = (Button) findViewById(R.id.btn2);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        final Calendar calendar = Calendar.getInstance();
        if (id == R.id.btn1) {
            anyo = calendar.get(Calendar.YEAR);
            mes = calendar.get(Calendar.MONTH);
            dia = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog calenadario = new DatePickerDialog(CalendarioActivity.this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view,
                                              int year, int month, int dayOfMonth) {
                            String fecha = "La fecha que has selecionado es: " + dayOfMonth + "/" + (month + 1) + "/" + year;
                            Toast.makeText(getApplicationContext(),
                                    fecha,
                                    Toast.LENGTH_LONG).show();
                        }
                    }, anyo, mes, dia);
            calenadario.show();

        } else if (id == R.id.btn2) {
            hora = calendar.get(Calendar.HOUR_OF_DAY);
            minuto = calendar.get(Calendar.MINUTE);
            TimePickerDialog horario = new TimePickerDialog(CalendarioActivity.this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            String horarioSelcionado = "la hora que has selecionado es: " + hourOfDay+":"+minute;
                            Toast.makeText(getApplicationContext(), horarioSelcionado, Toast.LENGTH_LONG).show();
                        }

                    }, hora, minuto, true);
            horario.show();

        }
    }
}