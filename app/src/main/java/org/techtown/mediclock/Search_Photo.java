package org.techtown.mediclock;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Search_Photo extends AppCompatActivity {
    Button button = null;
    ImageView iv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_photo);
        setup();
    }
    private void setup() {
        button = (Button) findViewById(R.id.btn);
        iv = (ImageView) findViewById(R.id.iv);

        button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v)
        {
             Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,1);
        }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        iv.setImageURI(data.getData());
    }
}



