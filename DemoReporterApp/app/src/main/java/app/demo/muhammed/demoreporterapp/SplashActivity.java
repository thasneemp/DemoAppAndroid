package app.demo.muhammed.demoreporterapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import app.demo.muhammed.demoreporterapp.ui.Container;
import app.demo.muhammed.demoreporterapp.ui.HomeActivity;

public class SplashActivity extends Container {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            }
        }, 1000 * 3);
    }
}
