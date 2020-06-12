package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class Mymeditime_min extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymeditime_min);


        //final TextView textView = (TextView)findViewById(R.id.min);
        final EditText textView = (EditText)findViewById(R.id.min);
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
                //textView.setText(textView + button_1.getText());
                String s = button_1.getText().toString();
                textView.setText(s);

            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_2.getText());
                String s = button_2.getText().toString();
                textView.setText(s);

            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_3.getText());
                String s = button_3.getText().toString();
                textView.setText(s);

            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_4.getText());
                String s = button_4.getText().toString();
                textView.setText(s);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_5.getText());
                String s = button_5.getText().toString();
                textView.setText(s);
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_6.getText());
                String s = button_6.getText().toString();
                textView.setText(s);
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_7.getText());
                String s = button_7.getText().toString();
                textView.setText(s);
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_8.getText());
                String s = button_8.getText().toString();
                textView.setText(s);
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_9.getText());
                String s = button_9.getText().toString();
                textView.setText(s);
            }
        });
        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_10.getText());
                String s = button_10.getText().toString();
                textView.setText(s);
            }
        });
        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_11.getText());
                String s = button_11.getText().toString();
                textView.setText(s);
            }
        });
        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText(button_12.getText());
                String s = button_12.getText().toString();
                textView.setText(s);
            }
        });


        button_cfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_medirepeat = new Intent(getApplicationContext(), Medirepeat.class); //일단 바로 검색결과 띄음
                startActivity(intent_medirepeat);
            }
        });
    }
    /*EditText min;
    Button [] numButtons = new Button[10];

    int [] numBtnIDs = {
            R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_4, R.id.button_5,
            R.id.button_6, R.id.button_7, R.id.button_8, R.id.button_9, R.id.button_10,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mainmenu);

        min = (EditText)findViewById(R.id.min);

        for(int i = 0; i < 10 ; i++) {
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
            int num = Integer.valueOf(textView.getText().toString());
            textView.setText(num);
        }
    }*/
}
