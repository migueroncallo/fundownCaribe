package com.example.migueroncallo.fundown_cupcakes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class mix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

    }
}
