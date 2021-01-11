package com.example.carlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class carre extends AppCompatActivity {
    Button B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carre);
        init();
        click();
    }

    private void click() {
    B.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent jp = new Intent(carre.this,Login.class);
            startActivity(jp);
        }
    });
    }

    private void init() {
        B = (findViewById(R.id.reg));
    }
}