package com.example.redes.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Create");
    }

    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Start");
    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Resume");
    }

    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Pause");
    }

    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Stop");
    }

    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Restart");
    }
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Destroy");
    }
    /*@Override
    protected void onStart(Bundle savedInstanceState) {
        super.onStart();
        setContentView(R.layout.activity_main);
        System.out.println("EStoy en Start");*/
    }



