package com.example.migueroncallo.fundown_cupcakes;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Splash extends Activity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = (ImageView) findViewById(R.id.splash1Back);

        splashChange();


    }



    void splashChange(){
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {

                    Intent intent = new Intent(Splash.this, Splash2.class);
                    startActivity(intent);

                }
            }
        };
        timerThread.start();
    }



}
