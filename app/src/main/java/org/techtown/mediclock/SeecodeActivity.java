package org.techtown.mediclock;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.support.v4.app.*;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class SeecodeActivity extends AppCompatActivity {

    //private static String TAG = "휴대폰 정보 가져오기";
    //final TextView seecode = (TextView) findViewById(R.id.seecode);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_seecode);

        TextView seecode = findViewById(R.id.seecode);
        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        String android_id = Settings.Secure.getString(this.getContentResolver(), Settings.Secure.ANDROID_ID);
        //Log.d(TAG, android_id);
        // String android_id="088738928";
        //int id2 = Integer.parseInt(android_id);
         seecode.setText(android_id);

    }
}

