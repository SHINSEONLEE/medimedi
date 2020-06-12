package org.techtown.mediclock;
/*<<<<<<< Updated upstream:mediclock/app/src/main/java/company/co/mediclock/Search_ResultList.java

import androidx.appcompat.app.AppCompatActivity;

=======
>>>>>>> Stashed changes:mediclock/app/src/main/java/company/co/mediclock/ShareActiviry.java*/

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/*<<<<<<< Updated upstream:mediclock/app/src/main/java/company/co/mediclock/Search_ResultList.java
public class Search_ResultList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_list);
    }
=======
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class ShareActiviry extends Fragment {
 /*   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_share);
    }
 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
     ViewGroup rootView  = (ViewGroup) inflater.inflate(R.layout.fragment_share, container, false); //container 라는 뷰 안에 첫번째 인자를 넣어줘라, 메모리에 올려준 것

     Button bbutton = rootView.findViewById(R.id.button6);
     bbutton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v){
             MainActivity activity = (MainActivity) getActivity();
             activity.onFragmentChanged(0);
         }
     });
     return rootView;
 }
>>>>>>> Stashed changes:mediclock/app/src/main/java/company/co/mediclock/ShareActiviry.java*/

public class Search_Text extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_search__text);

        Button button = findViewById(R.id.searchtext_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_search_list = new Intent(getApplicationContext(), Search_List.class); //일단 바로 검색결과 띄음
                startActivity(intent_search_list);

            }
        });
    }
}

