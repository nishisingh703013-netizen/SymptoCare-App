package com.example.symptocare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.app.Activity
import android.content.Intent

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val symptomInput = findViewById<EditText>(R.id.symptomInput)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultText = findViewById<TextView>(R.id.resultText)
        checkButton.setOnClickListener {
            val symptoms = symptomInput.text.toString().trim()
            if (symptoms.isEmpty()) {
             symptomInput.error = "Please eneter your symptoms"
            } else {
                val symptomList = symptoms.split(",").map{it.trim()}.filter{it.isNotEmpty()}
                val database = DiseaseDatabase()
                val validSymptoms = database.diseases.flatMap{it.symptoms.split(",")}.map{it.trim().lowercase()}.toSet()
                val enteredSymptoms = symptomList.map{it.lowercase()}.distinct()
                if (enteredSymptoms.any{it !in validSymptoms}) {symptomInput.error = "Please enter valid symptoms"
                }else if(enteredSymptoms.size < 3){
                    symptomInput.error = "Please eneter more symptoms"
                } else {
                    val intent = Intent(this, AnalysisActivity::class.java)
                    intent.putExtra("symptoms", symptoms)
                    startActivity(intent)
                }
            }

        }
    }
}






