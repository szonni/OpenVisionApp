package vn.edu.usth.ovnapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler(Objects.requireNonNull(Looper.myLooper())).postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivities(new Intent[]{new Intent(SplashScreen.this, MainActivity.class)});
                finish();
            }
        }, 2000);
    }
}
