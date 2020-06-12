package org.techtown.mediclock;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Mediweek extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mediweek);

        Button button = findViewById(R.id.confirmweek_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_medialarm = new Intent(getApplicationContext(), Medialarm.class); //일단 바로 검색결과 띄음
                startActivity(intent_medialarm);

            }
        });
        //private boolean check = false;
        final Button mon = findViewById(R.id.mon);
        final Button tue = findViewById(R.id.tue);
        final Button wed = findViewById(R.id.wed);
        final Button thur = findViewById(R.id.thur);
        final Button fri = findViewById(R.id.fri);
        final Button sat = findViewById(R.id.sat);
        final Button sun = findViewById(R.id.sun);
        final Button every = findViewById(R.id.everyday);


        mon.setOnClickListener(new View.OnClickListener() {
            int clickmon = 0;
            public void onClick(View view) {
                if(clickmon == 0)
                {
                    mon.setSelected(true);
                    mon.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clickmon = 1;
                }
                else
                {
                    mon.setSelected(false);
                    mon.setBackgroundResource(R.drawable.pr_button_week);
                    clickmon= 0;
                }
            }
        });
        tue.setOnClickListener(new View.OnClickListener() {
            int clicktue = 0;
            public void onClick(View view) {
                if(clicktue == 0)
                {
                    tue.setSelected(true);
                    tue.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clicktue = 1;
                }
                else
                {
                    tue.setSelected(false);
                    tue.setBackgroundResource(R.drawable.pr_button_week);
                    clicktue= 0;
                }
            }
        });

        wed.setOnClickListener(new View.OnClickListener() {
            int clickwed = 0;
            public void onClick(View view) {
                if(clickwed == 0)
                {
                    wed.setSelected(true);
                    wed.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clickwed = 1;
                }
                else
                {
                    wed.setSelected(false);
                    wed.setBackgroundResource(R.drawable.pr_button_week);
                    clickwed= 0;
                }
            }
        });
        thur.setOnClickListener(new View.OnClickListener() {
            int clickthur = 0;
            public void onClick(View view) {
                if(clickthur == 0)
                {
                    thur.setSelected(true);
                    thur.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clickthur = 1;
                }
                else
                {
                    thur.setSelected(false);
                    thur.setBackgroundResource(R.drawable.pr_button_week);
                    clickthur= 0;
                }
            }
        });
        fri.setOnClickListener(new View.OnClickListener() {
            int clickfri = 0;
            public void onClick(View view) {
                if(clickfri == 0)
                {
                    fri.setSelected(true);
                    fri.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clickfri = 1;
                }
                else
                {
                    fri.setSelected(false);
                    fri.setBackgroundResource(R.drawable.pr_button_week);
                    clickfri= 0;
                }
            }
        });
        sat.setOnClickListener(new View.OnClickListener() {
            int clicksat = 0;
            public void onClick(View view) {
                if(clicksat == 0)
                {
                    sat.setSelected(true);
                    sat.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clicksat = 1;
                }
                else
                {
                    sat.setSelected(false);
                    sat.setBackgroundResource(R.drawable.pr_button_week);
                    clicksat= 0;
                }
            }
        });
        sun.setOnClickListener(new View.OnClickListener() {
            int clicksun = 0;
            public void onClick(View view) {
                if(clicksun == 0)
                {
                    sun.setSelected(true);
                    sun.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clicksun = 1;
                }
                else
                {
                    sun.setSelected(false);
                    sun.setBackgroundResource(R.drawable.pr_button_week);
                    clicksun= 0;
                }
            }
        });
        every.setOnClickListener(new View.OnClickListener() {
            int clickevery = 0;
            public void onClick(View view) {
                if(clickevery == 0)
                {
                    every.setSelected(true);
                    every.setBackgroundResource(R.drawable.pr_button_week_pressed);
                    clickevery = 1;
                }
                else
                {
                    every.setSelected(false);
                    every.setBackgroundResource(R.drawable.pr_button_week);
                    clickevery= 0;
                }
            }
        });
    }

}
