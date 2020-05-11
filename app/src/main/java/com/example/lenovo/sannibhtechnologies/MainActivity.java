package com.example.lenovo.sannibhtechnologies;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id= item.getItemId();
        if(id==R.id.home)
        {
            startActivity(new Intent(this,MainActivity.class));
        }
        else  if(id==R.id.about)
        {
            startActivity(new Intent(this,About.class));
        }
        else  if(id==R.id.services)
        {
            startActivity(new Intent(this,Services.class));
        }
        else  if(id==R.id.cppd)
        {
            startActivity(new Intent(this,CPDP.class));
        }
        else  if(id==R.id.gallery)
        {
            startActivity(new Intent(this,Gallery.class));
        }
        else  if(id==R.id.contactus)
        {
            startActivity(new Intent(this,ContactUs.class));
        }
        return true;
    }
    public void dialcall(View view)
    {
        Intent p = new Intent(Intent.ACTION_DIAL);
        p.setData(Uri.parse("tel:919427372629"));
        if (p.resolveActivity(getPackageManager()) != null) {
            startActivity(p);
        }
    }
}
