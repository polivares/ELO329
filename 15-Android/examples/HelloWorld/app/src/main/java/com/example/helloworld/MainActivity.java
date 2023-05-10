package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Carga de elementos visuales de manera similar a lo
        // que se haría con JavaFX/Scene Builder
        setContentView(R.layout.activity_main);
    }
}