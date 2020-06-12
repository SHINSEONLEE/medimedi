package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Medirepeat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_medirepeat);

        Button button1 = findViewById(R.id.weekday);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_mediweek = new Intent(getApplicationContext(), Mediweek.class); //일단 바로 검색결과 띄음
                startActivity(intent_mediweek);

            }
        });
        Button button2 = findViewById(R.id.day);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_mediweekdays = new Intent(getApplicationContext(), Mediweekdays.class); //일단 바로 검색결과 띄음
                startActivity(intent_mediweekdays);

            }
        });
    }
}