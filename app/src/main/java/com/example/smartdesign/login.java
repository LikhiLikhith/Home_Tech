package com.example.smartdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class login extends AppCompatActivity {

    Button button ;
    RadioButton Admin,User,BA,BN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Admin = (RadioButton)findViewById(R.id.Admin);
        User = (RadioButton)findViewById(R.id.User);
        BA = (RadioButton)findViewById(R.id.AdB);
        BN = (RadioButton)findViewById(R.id.NrB);
        button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Admin.isChecked()){
                    Intent intent = new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                }else if (User.isChecked()){
                    Intent intent = new Intent(login.this,NormalMain.class);
                    startActivity(intent);
                }else if (BA.isChecked()){

                    Intent intent = new Intent(login.this,BAMain.class);
                    startActivity(intent);
                }else if (BN.isChecked()){
                    Intent intent = new Intent(login.this,BaNuMain.class);
                    startActivity(intent);
                }
            }
        });



    }

    public void onRadioButtonClicked(View view) {

    }

}
