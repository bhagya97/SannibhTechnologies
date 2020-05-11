package com.example.lenovo.sannibhtechnologies;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity
{

    public static final int id=0;

    EditText et1,et2,et3,et4;
    Button b;

    String name,email,mobile_no,message;
    public String uname="root";
    public String psw="mysql";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        et1=(EditText) findViewById(R.id.editText);
        et2=(EditText) findViewById(R.id.editText2);
        et3=(EditText) findViewById(R.id.editText3);
        et4=(EditText) findViewById(R.id.editText4);
        b= (Button)findViewById(R.id.button);
    }

    public void submit(View view) {
        name=et1.getText().toString();
        email=et2.getText().toString();
        mobile_no=et3.getText().toString();
        message=et4.getText().toString();

        BackgroundActivity bg= new BackgroundActivity(this);
       // bg.onPreExecute(uname,psw);
        bg.execute(name,mobile_no,email,message);
        finish();
        sendNotification();
        Toast.makeText(this,"You are notified!",Toast.LENGTH_LONG).show();


    }

    public void sendNotification(){

       // Intent i=new Intent(this,MainActivity.class);
       // PendingIntent pi=PendingIntent.getActivities(this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder notbuilder= new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.st1)
                .setContentTitle("Sannibh Technologies")
                .setContentText("Someone submitted a request to contact with you!")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setOngoing(true);
        //notbuilder.setContentIntent(pi);

        NotificationManager nom = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notbuilder.setVibrate( new long[] {0,1000});

        nom.notify(id,notbuilder.build());

    }
}

