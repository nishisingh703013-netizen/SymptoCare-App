package com.example.symptocare;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import android.app.Activity;
import android.os.Handler;
import android.content.Intent;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnalysisActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        String symptoms=getIntent().getStringExtra("symptoms");
        DiseaseDatabase database=new DiseaseDatabase();
        String[] userSymptoms=symptoms.toLowerCase().split(",");
        Disease bestMatch=null;
        int maxMAtchCount=0;
        for (Disease disease: database.getDiseases()) {
            String[] diseaseSymptoms = disease.getSymptoms().toLowerCase().split(",");
            int matchCount = 0;
            for (String UserSymptom: userSymptoms) {
                for (String diseaseSymptom : diseaseSymptoms) {
                    if (UserSymptom.equals(diseaseSymptom.trim())) {
                        matchCount++;
                    }
                }
            }
            if (matchCount > maxMAtchCount) {
                maxMAtchCount = matchCount;
                bestMatch = disease;
            }
        }
        final Disease finalBestmatch= bestMatch;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(AnalysisActivity.this, ResultActivity.class);
            if(finalBestmatch != null) {
                intent.putExtra("condition",finalBestmatch.getName());
                intent.putExtra("symptoms", finalBestmatch.getSymptoms());
                intent.putExtra("prevention", finalBestmatch.getPrevention());
                intent.putExtra("homeCare","Please consult a doctor for appropriate care.");
            } else{
                intent.putExtra("condition","Noo matching condition found");
                intent.putExtra("symptoms",symptoms);
                intent.putExtra("prevention", "Please consult a doctor for proper guidance.");
                intent.putExtra("homeCare", "Please consult a health care professional.");
            }
            startActivity(intent);
            finish();
        }, 2000);

    }
}