package com.example.carlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Long4;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button B,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //all fields are init here
        init();
        //all clicks are init here
        click();
    }

    private void click() {
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,Login.class);
                startActivity(b);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2 = new Intent(MainActivity.this,carre.class);
                startActivity(b2);
            }
        });
    }

    private void init() {
        B = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
    }
}