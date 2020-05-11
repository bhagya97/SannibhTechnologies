package com.example.lenovo.sannibhtechnologies;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ListAdapter;
        import android.widget.ListView;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
    }

    public void serA(View view) {
        startActivity(new Intent(this,SoftwareDevelopment.class));
    }

    public void serB(View view) {
        startActivity(new Intent(this,Training.class));
    }

    public void serC(View view) {
        startActivity(new Intent(this,Mentoring.class));
    }

    public void serD(View view) {
        startActivity(new Intent(this,School.class));
    }
}

        /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?>lv, tv1, 0, 1)
            {
                startActivity(new Intent(this,SoftwareDevelopment.class));
            }
        });*

       /* ListView lv = lv.getView();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View itemView, int itemPosition, long itemId)
            {
                Intent launchActivity = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(launchActivity);
            }
        });*/


