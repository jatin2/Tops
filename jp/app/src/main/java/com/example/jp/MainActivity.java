package com.example.jp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                Intent  intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("jatin",data);
                startActivity(intent);

            }
        });
    }
}