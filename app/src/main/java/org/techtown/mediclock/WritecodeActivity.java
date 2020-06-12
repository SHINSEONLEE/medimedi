package org.techtown.mediclock;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class WritecodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_writecode);

        Button button = findViewById(R.id.confirmwritecode_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_shareactivity = new Intent(getApplicationContext(), ShareActivity.class); //일단 바로 검색결과 띄음
                startActivity(intent_shareactivity);

            }
        });
    }
}
