package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Mediname extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mediname);

        Button button = findViewById(R.id.confirm);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_meditime = new Intent(getApplicationContext(), Medirepeat.class); //일단 바로 검색결과 띄음
                startActivity(intent_meditime);
                Toast toastView = Toast.makeText(getApplicationContext(), "약 이름이 설정되었습니다", Toast.LENGTH_LONG);
                toastView.setGravity( Gravity.TOP| Gravity.LEFT, 320, 700); //토스트 메시지 위치 x,y좌표로 바꿀 수 있다.
                toastView.show();

            }
        });
    }
}
