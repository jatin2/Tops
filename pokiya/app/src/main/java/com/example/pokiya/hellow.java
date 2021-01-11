package com.example.pokiya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class hellow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellow);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent movie = new Intent(hellow.this,MainActivity.class);
                startActivity(movie);
                finish();
            }
        },2000);
    }
}