package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Mediweekdays extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_weekdays);

        Button button = findViewById(R.id.confirmweekdays_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_medialarm = new Intent(getApplicationContext(), Medialarm.class); //일단 바로 검색결과 띄음
                startActivity(intent_medialarm);

            }
        });
    }
}
