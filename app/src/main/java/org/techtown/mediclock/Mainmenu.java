package org.techtown.mediclock;

import android.app.AppComponentFactory;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Mainmenu extends AppCompatActivity {
<<<<<<< HEAD

    private  static Context context;
=======
    ActionBar actionBar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent_home = new Intent(getApplicationContext(), Mainmenu.class);
                startActivity(intent_home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
>>>>>>> master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_mainmenu);

<<<<<<< HEAD
        Mainmenu.context = getApplicationContext();

=======
        actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.home);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME|ActionBar.DISPLAY_USE_LOGO);
/*
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_search :
                    // TODO : process the click event for action_search item.
                    return true ;
                // ...
                // ...
                default :
                    return super.onOptionsItemSelected(item) ;
            }
        }*/
>>>>>>> master
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