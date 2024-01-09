package com.somildoshi.ns_birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT >= 20) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.pinks));
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}