package com.example.gitandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgLion;
    private ImageView imgLeopard;
    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private boolean isVisible = true;
    private boolean isLionVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLeopard = findViewById(R.id.imgLeopard);
        imgLion = findViewById(R.id.imgLion);
        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);

        imgLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isLionVisible){
                    imgLion.animate().alpha(0).setDuration(3000);
                    imgLeopard.animate().alpha(1).setDuration(3000);
                    isLionVisible = false;
                }
                else if (!isLionVisible){
                    imgLeopard.animate().alpha(0).setDuration(3000);
                    imgLion.animate().alpha(1).setDuration(3000);
                    isLionVisible = true;
                }
            }
        });


        
        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isVisible){
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                    isVisible = false;
                }
                else if (!isVisible){
                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    isVisible = true;
                }

            }
        });


    }
}