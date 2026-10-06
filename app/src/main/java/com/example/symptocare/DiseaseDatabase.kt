package com.example.symptocare

data class Disease(
    val name : String,
    val symptoms:String,
    val Prevention: String
)
class DiseaseDatabase {
    val diseases = listOf(
        Disease(
            "Flu",
            "Fever,cough,body ache,fatigue",
            "Take rest, drink plenty of fluids and maintain hygiene."

        ),
        Disease(
            "Common COld",
            "runny nose, sneezing, cough, sore throat",
            "keep yourself warm, drink fluids and maintain hygiene."
        ),
        Disease(
            "headache",
            "headache, head pain, sensitivity to light",
            "Stay hydrated and take adequate rest."
        ),
        Disease(
            "Migraine",
            "severe headache, nausea, sensitivity to light",
            "Take adequate rest and avoid known triggers."
        ),
        Disease(
            "Indigestion",
            "stomach pain, bloating, acidity",
            "Eat light food and drink enough water."
        ),
        Disease(
            "Food poisoning",
            "Vomiting, diarrhea, stomach pain",
            "Maintain food hygiene and drink  enough fluids."
        ),
        Disease(
            "Allergy",
            "sneezing, itching, runny nose,",
            "Avoid known allergens and maintain cleanliness."
        ),
        Disease(
            "Sore throat",
            "throat pain, difficulty swallowing",
            "Drink warm fluids and maintain good hygiene."
        ),
        Disease(
            "Sinusitis",
            "facial pain, blocked nose, headache",
            "Maintain nasal hygiene and stay hydrated."
        ),
        Disease(
            "Viral fever",
            "fever, weakness, body ache",
            "Take rest, stay hydrated and monitor symptoms."
        ),
        Disease(
            "Asthama",
            "breathing difficulty, wheezing, cough",
            "Avoid known triggers and seek medical advice when needed."
        ),
        Disease(
            "Bronchitis",
            "cough, mucus, chest discomfort",
            "Rest, drink fluids and avoid smoke."
        ),
        Disease(
            "Dehydration",
            "thirst, dizziness, weakness",
            "Drink sufficient water and fluids."
        ),
        Disease(
            "Chickenpox",
            "fever, tiredness, itchy rash",
            "Maintain hygiene and avoid close contact with infected people."
        ),
        Disease(
            "Urinary Track Infection",
            "burning urination, frequent urination",
            "Drink water and consult a healthcare professional."
        )
    )
}