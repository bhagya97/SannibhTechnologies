package com.example.lenovo.sannibhtechnologies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Gallery extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        wv=(WebView) findViewById(R.id.webview);
        wv.loadUrl("http://sannibh.in/Gallery.php");

    }
}
