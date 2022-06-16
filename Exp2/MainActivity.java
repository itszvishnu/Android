package com.example.exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName,edtPass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.editText);
        edtPass = findViewById(R.id.editPass);
        btn = findViewById(R.id.btnSubmit);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edtName.getText().toString();
                String pass = edtPass.getText().toString();

                
                if(user.equals("wish") && pass.equals("123")){
                    Toast.makeText(MainActivity.this, "Password Successful", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(MainActivity.this,MainActivity2.class);
                    in.putExtra("Name", user);
                    startActivity(in);
                }else {
                    Toast.makeText(MainActivity.this, "Password Incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}