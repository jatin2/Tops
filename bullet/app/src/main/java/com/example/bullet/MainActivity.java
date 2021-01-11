package com.example.bullet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1,radioButton2,radioButton3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
        click();

    }

    private void click() {

        switch (RadioButton);{

        }

    }

    private void init() {
        radioButton1 =findViewById(R.id.radioButton1);
        radioButton2 =findViewById(R.id.radioButton2);
        radioButton3 =findViewById(R.id.radioButton3);
    }
}