package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class ShareAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sharealarm);

        Button button1 = findViewById(R.id.seecode);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_seecodeactivity = new Intent(getApplicationContext(), SeecodeActivity.class); //일단 바로 검색결과 띄음
                startActivity(intent_seecodeactivity);
            }
        });
        Button button2 = findViewById(R.id.writecode);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_writecodeactivity = new Intent(getApplicationContext(), WritecodeActivity.class); //일단 바로 검색결과 띄음
                startActivity(intent_writecodeactivity);
            }
        });

    }
}
