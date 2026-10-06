package com.example.symptocare;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import android.app.Activity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.Button;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button startButton= findViewById(R.id.startButton);
        startButton.setOnClickListener(V -> {
            Intent intent= new Intent(HomeActivity.this,MainActivity.class);
            startActivity(intent);
        });


    }
}