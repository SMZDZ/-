package com.ikingroc.smzdz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ikingroc.smzdz.activity.LoginActivity;
import com.ikingroc.smzdz.activity.SigsterActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    private Button btnSigster;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v)
            {
                Intent in = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(in);
            }

        });
        btnSigster=findViewById(R.id.btn_sigster);
        btnSigster.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v)
            {
                Intent in = new Intent(MainActivity.this, SigsterActivity.class);
                startActivity(in);
            }

        });

    }

}