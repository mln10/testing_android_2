package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello");
        System.out.println("JELLOW");
        System.out.println("CELLOW");
        System.out.println(("Testing Branch"));
        System.out.println(("Testing Branch r"));

    }
}