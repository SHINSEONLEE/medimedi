package org.techtown.mediclock;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Description extends AppCompatActivity {
 /*   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView  = (ViewGroup) inflater.inflate(R.layout.fragment_description, container, false); //container 라는 뷰 안에 첫번째 인자를 넣어줘라, 메모리에 올려준 것

        Button bbutton = rootView.findViewById(R.id.home);
        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(0);
            }
        });
        return rootView;
    }
}*/
 @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.fragment_description);

     Button button1 = findViewById(R.id.howtouse_btn);
     button1.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
             Intent intent_howtouse = new Intent(getApplicationContext(), Howtouse.class); //일단 바로 검색결과 띄음
             startActivity(intent_howtouse);
        /*
                 intent.putExtra("name", "mike"); //부가 데이터
                // setResult(200, intent); //200이 응답코드이다. 200 대신 RESULT_OK를 넣어도 가능

                 finish();*/
         }
     });
     Button button2 = findViewById(R.id.introduction_btn);
     button2.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
             Intent intent_introduction = new Intent(getApplicationContext(), Introduction.class); //일단 바로 검색결과 띄음
             startActivity(intent_introduction);
        /*
                 intent.putExtra("name", "mike"); //부가 데이터
                // setResult(200, intent); //200이 응답코드이다. 200 대신 RESULT_OK를 넣어도 가능

                 finish();*/
         }
     });
 }
}
