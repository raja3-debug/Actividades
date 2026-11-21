package com.example.miaplicacin;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class NotificacionActivity  extends AppCompatActivity implements View.OnClickListener{
    Button boton;
    private NotificationManager notificator;
    NotificationCompat.Builder builder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacion);
        boton=(Button) findViewById(R.id.Btnnotificacion);
        boton.setOnClickListener(this);
        notificator = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("canal_id", "Canal Web", NotificationManager.IMPORTANCE_DEFAULT);
            if (notificator != null) {
                notificator.createNotificationChannel(channel);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS) != android.content.pm.PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, 101);
            }
        }
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.edu.gva.es/iesjoancoromines/"));

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(NotificacionActivity.class);
        stackBuilder.addNextIntent(intent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(
                0, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
        );
        Bitmap iconoGrande = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);


        builder = new NotificationCompat.Builder(this,"canal_id");
                builder.setSmallIcon(android.R.drawable.stat_sys_warning)
                .setLargeIcon(iconoGrande)
                .setContentTitle("MENSAJE DE ALERTA")
                .setContentText("Abrir la pagina web de IES JOAN COROMINES.")
                .setTicker("AVISO DE NOTIFICACIÓN")
                .setContentIntent(resultPendingIntent)
                .setAutoCancel(true);
        notificator.notify(1, builder.build());


    }
}
