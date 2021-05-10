package com.android.a60styleabletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {

    Button btnSimpleToast,btnSimpleToastColor,btnToastRadius,btnToastIcon,btnToastIconSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpleToast = findViewById(R.id.btnSimpleToast);
        btnSimpleToastColor = findViewById(R.id.btnSimpleColorToast);
        btnToastRadius = findViewById(R.id.btnToastCornerRadius);
        btnToastIcon = findViewById(R.id.btnToastIcon);
        btnToastIconSpin = findViewById(R.id.btnToastIconSpin);

        btnSimpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast styleableToast = new StyleableToast(getApplicationContext(),"Simple Toast", Toast.LENGTH_LONG);
                styleableToast.show();
            }
        });

        btnSimpleToastColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast styleableToast = new StyleableToast(getApplicationContext(),"Simple Toast Color", Toast.LENGTH_LONG);
                styleableToast.setBackgroundColor(Color.parseColor("#FF5A5F"));
                styleableToast.setTextColor(Color.WHITE);
                styleableToast.show();
            }
        });

        btnToastRadius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast styleableToast = new StyleableToast(getApplicationContext(),"Toast Radius", Toast.LENGTH_LONG);
                styleableToast.setBackgroundColor(Color.parseColor("#3791CC"));
                styleableToast.setTextColor(Color.WHITE);
                styleableToast.setCornerRadius(2);
                styleableToast.show();
            }
        });

        btnToastIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast styleableToast = new StyleableToast(getApplicationContext(),"Toast Icon", Toast.LENGTH_LONG);
                styleableToast.setBackgroundColor(Color.parseColor("#3791CC"));
                styleableToast.setTextColor(Color.WHITE);
                styleableToast.setIcon(R.drawable.ic_baseline_refresh_24);
                styleableToast.show();
            }
        });

        btnToastIconSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast styleableToast = new StyleableToast(getApplicationContext(),"Toast Icon Spin", Toast.LENGTH_LONG);
                styleableToast.setBackgroundColor(Color.parseColor("#3791CC"));
                styleableToast.setTextColor(Color.WHITE);
                styleableToast.setIcon(R.drawable.ic_baseline_refresh_24);
                styleableToast.spinIcon();
                styleableToast.show();
            }
        });
    }
}