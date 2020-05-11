package com.example.lenovo.sannibhtechnologies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Training extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        wv=(WebView) findViewById(R.id.wv1);
        wv.loadUrl("http://sannibh.in/Training.php");

    }
}
