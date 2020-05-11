package com.example.lenovo.sannibhtechnologies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class About extends AppCompatActivity {

    ImageButton show,hide;
    TextView desc_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        desc_text = (TextView) findViewById(R.id.description_text);
        show = (ImageButton) findViewById(R.id.show);
        show.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Show button");
                show.setVisibility(View.INVISIBLE);
                hide.setVisibility(View.VISIBLE);
                desc_text.setVisibility(View.VISIBLE);

            }
        });
        hide = (ImageButton) findViewById(R.id.hide);
        hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Hide button");
                hide.setVisibility(View.INVISIBLE);
                show.setVisibility(View.VISIBLE);
                desc_text.setVisibility(View.INVISIBLE);

            }
        });

    }
}
