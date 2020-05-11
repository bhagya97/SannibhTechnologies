package com.example.lenovo.sannibhtechnologies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class School extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        wv=(WebView) findViewById(R.id.wv2);
        wv.loadUrl("http://sannibh.in/FinishingSchools.php#fs1");
    }
}
