package com.example.exp3;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView im;
    Canvas cv;
    Button rec,triangle,Circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        im = (ImageView) findViewById(R.id.imageView);
        rec = findViewById(R.id.button2);
        triangle = findViewById(R.id.btnTri);
        Circle = findViewById(R.id.btnCircle);

        Bitmap bg = Bitmap.createBitmap(720,720,Bitmap.Config.ARGB_8888);
        im.setBackground(new BitmapDrawable(bg));
        cv = new Canvas(bg);


        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#36AE7C"));
        cv.drawCircle(500,500,50,paint);


        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paint paint = new Paint();
                paint.setColor(Color.parseColor("#4700D8"));
                cv.drawRect(600,200,500,300,paint);
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Paint paint = new Paint();
                Path path = new Path();
                paint.setColor(Color.parseColor("#FF4949"));

                Point a = new Point(350,50);
                Point b = new Point(350,300);
                Point c = new Point(350,300);


                path.lineTo(a.x,a.y);
                path.lineTo(b.x,b.y);
                path.lineTo(c.x,c.y);
                cv.drawPath(path,paint);
            }
        });


    }
}