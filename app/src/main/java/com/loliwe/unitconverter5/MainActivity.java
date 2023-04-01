package com.loliwe.unitconverter5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button exitBtn;
    Button nextBtn1;
    Button nextBtn2;
    Button nextBtn3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitBtn = findViewById(R.id.btn17);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bye", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        
        nextBtn1 = findViewById(R.id.NextBtn1);
        nextBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("Checking", "1st button is clicked");
                Intent newIntent = new Intent(MainActivity.this, LengthActivity.class);
                startActivity(newIntent);
            }
        });

        nextBtn2 = findViewById(R.id.NextBtn2);
        nextBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("Checking", "2nd button is clicked");
                Intent newIntent = new Intent(MainActivity.this, WeightActivity.class);
                startActivity(newIntent);
            }
        });

        nextBtn3 = findViewById(R.id.NextBtn3);
        nextBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("Checking", "3rd button is clicked");
                Intent newIntent = new Intent(MainActivity.this, TempActivity.class);
                startActivity(newIntent);
            }
        });
    }
}