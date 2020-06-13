package org.techtown.mediclock;

import android.app.AppComponentFactory;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Mainmenu extends AppCompatActivity {

    private  static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mainmenu);

        Mainmenu.context = getApplicationContext();

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_searchactivity = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent_searchactivity);
            }
        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_medimorning = new Intent(getApplicationContext(), Medimorning.class);
                startActivity(intent_medimorning);
            }
        });
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_mediname = new Intent(getApplicationContext(), Mediname.class);
                startActivity(intent_mediname);
            }
        });
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_sharealarm = new Intent(getApplicationContext(), ShareAlarm.class);
                startActivity(intent_sharealarm);
            }
        });
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_description = new Intent(getApplicationContext(), Description.class);
                startActivity(intent_description);
            }
        });
    }
    public static Context getAppContext() {
        return Mainmenu.context;
    }

}