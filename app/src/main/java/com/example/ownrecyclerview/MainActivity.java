package com.example.ownrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Layout1 layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = findViewById(R.id.layout1);

        layout1.setName("홍준하");
        layout1.setMobile("010-2748-4325");
    }
}
