package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


  TextView t1;
  Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = findViewById(R.id.textView);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/Spring in May.ttf");
        Intent intent = getIntent();
        String str = intent.getStringExtra("Name");
        t1.setText(str);


        btnChange = findViewById(R.id.btn);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setTextSize(34);
                t1.setTypeface(type);
                t1.setTextColor(Color.RED);
            }
        });

    }
}