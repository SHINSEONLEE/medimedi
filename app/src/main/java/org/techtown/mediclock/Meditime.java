package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Meditime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_meditime);

        Button button1 = findViewById(R.id.morning);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_mymeditime_hour = new Intent(getApplicationContext(), Mymeditime_hour.class); //일단 바로 검색결과 띄음
                startActivity(intent_mymeditime_hour);

            }
        });
        Button button2 = findViewById(R.id.after);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_mymeditime_hour = new Intent(getApplicationContext(), Mymeditime_hour.class); //일단 바로 검색결과 띄음
                startActivity(intent_mymeditime_hour);

            }
        });
    }
}