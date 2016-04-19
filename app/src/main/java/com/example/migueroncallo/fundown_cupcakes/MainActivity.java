package com.example.migueroncallo.fundown_cupcakes;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView imageView, bowl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        imageView = (ImageView)findViewById(R.id.mainBackground);
        bowl = (ImageView)findViewById(R.id.bowlButton);

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.kitchen);
        Bitmap bMapScaled = Bitmap.createScaledBitmap(bMap, width, height, true);
        imageView.setImageBitmap(bMapScaled);


        bowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mix.class);
                startActivity(intent);
            }
        });


    }
}
