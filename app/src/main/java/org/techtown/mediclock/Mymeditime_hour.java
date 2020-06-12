package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class Mymeditime_hour extends AppCompatActivity {
    /*
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_mymeditime_hour);
        }

     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mymeditime_hour);


        final TextView textView = (TextView)findViewById(R.id.hour);
        final Button button_cfm = findViewById(R.id.confirmtime_btn);

        final Button button_1 = findViewById(R.id.button_1);
        final Button button_2 = findViewById(R.id.button_2);
        final Button button_3 = findViewById(R.id.button_3);
        final Button button_4 = findViewById(R.id.button_4);
        final Button button_5 = findViewById(R.id.button_5);
        final Button button_6 = findViewById(R.id.button_6);
        final Button button_7 = findViewById(R.id.button_7);
        final Button button_8 = findViewById(R.id.button_8);
        final Button button_9 = findViewById(R.id.button_9);
        final Button button_10 = findViewById(R.id.button_10);
        final Button button_11 = findViewById(R.id.button_11);
        final Button button_12 = findViewById(R.id.button_12);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_1.getText());
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_2.getText());
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_3.getText());
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_4.getText());
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_5.getText());
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_6.getText());
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_7.getText());
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_8.getText());
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_9.getText());
            }
        });
        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_10.getText());
            }
        });
        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_11.getText());
            }
        });
        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(button_12.getText());
            }
        });



        button_cfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meditime_min = new Intent(getApplicationContext(), Mymeditime_min.class); //일단 바로 검색결과 띄음
                startActivity(meditime_min);
            }
        });
    }
}
