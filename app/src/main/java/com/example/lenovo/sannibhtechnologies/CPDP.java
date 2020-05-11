package com.example.lenovo.sannibhtechnologies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CPDP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpdp);
    }

    public void appraisal(View view) {
        startActivity(new Intent(this,TAppraisal.class));
    }
    public void training(View view) {
        startActivity(new Intent(this,TTraining.class));
    }
}
