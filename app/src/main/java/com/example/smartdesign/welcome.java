package com.example.smartdesign;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {

    Button button;
    WifiManager wifiManager;
    BluetoothHeadset bluetoothHeadset;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        wifiManager = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                
        button = (Button) findViewById(R.id.bluetoothmod);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(welcome.this,uniqueid.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.wifimod);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wifiManager.setWifiEnabled(true);
                Intent intent = new Intent(welcome.this,uniqueid.class);
                startActivity(intent);
            }
        });

    }

}
