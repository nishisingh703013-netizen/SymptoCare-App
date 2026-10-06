package com.example.symptocare;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;


public class ResultActivity extends Activity {
    TextView conditionText,symptomsText,preventionText,homeCareText;
    Button checkAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        conditionText=findViewById(R.id.conditionText);
        symptomsText=findViewById(R.id.symptomsText);
        preventionText=findViewById(R.id.preventiontext);
        homeCareText=findViewById(R.id.homeCareText);
        checkAgainButton=findViewById(R.id.checkAgainButton);
        String condition= getIntent().getStringExtra("condition");
        String symptoms= getIntent().getStringExtra("symptoms");
        String prevention= getIntent().getStringExtra("prevention");
        String homeCare= getIntent().getStringExtra("homeCare");
        conditionText.setText(condition);
        symptomsText.setText(symptoms);
        preventionText.setText(prevention);
        homeCareText.setText(homeCare);
        checkAgainButton.setOnClickListener(v -> {
            finish();
        });


    }
}