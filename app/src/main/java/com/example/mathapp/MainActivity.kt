package com.example.mathapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    lateinit var questionTextView : TextView
    lateinit var answerView : EditText
    var firstNumber = 0
    var secondNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.textView)
        answerView = findViewById(R.id.answerEditText)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener() {
            checkAnswer()

        }

        setNewQuestion()
    }

    fun checkAnswer() {
        val answerText = answerView.text.toString()
        val answer = answerText.toIntOrNull()
        val correctAnswer = firstNumber + secondNumber

        if(answer == correctAnswer) {
            Log.d("!!!", "Rätt svar!")
        } else {
            Log.d("!!!", "Fel svar!")
        }
    }

    fun setNewQuestion() {
        firstNumber = (1.. 10).random()
        secondNumber = (1..10).random()

        questionTextView.text = "$firstNumber + $secondNumber"


    }
}