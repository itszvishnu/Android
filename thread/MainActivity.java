package com.example.threadexp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar p=(ProgressBar)findViewById(R.id.progressBar1);
        final TextView t=(TextView)findViewById(R.id.textView1);
        //final TextView t1=(TextView)findViewById(R.id.textView2);
        Button b=(Button)findViewById(R.id.button1);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<100;i++){
                            final int temp = i;
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException err){
                                err.printStackTrace();
                            }

                            p.post(new Runnable() {
                                @SuppressLint("SetTextI18n")
                                @Override
                                public void run() {
                                    p.setProgress(temp);
                                    t.setText(temp + "%");
                                }
                            });
                        }
                    }
                };
                new Thread(r).start();
            }

        });
    }
}