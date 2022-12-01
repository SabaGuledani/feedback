package com.example.shualedurifeedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var ki:CheckBox
    private lateinit var ara:CheckBox
    private lateinit var saxeli:EditText
    private lateinit var gvari:EditText
    private lateinit var feedbacktext:EditText
    private lateinit var gagzavna:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ki = findViewById(R.id.ki)
        ara = findViewById(R.id.ara)
        saxeli = findViewById(R.id.saxeli)
        gvari = findViewById(R.id.gvari)
        feedbacktext = findViewById(R.id.textfb)
        gagzavna = findViewById(R.id.gagzavna)

        gagzavna.setOnClickListener {
            if ((ki.isChecked && !ara.isChecked) || (ara.isChecked && !ki.isChecked)){
                if(saxeli.text.toString().length >= 3 && gvari.text.toString().length >= 5
                    && feedbacktext.text.toString().length >= 10){
                    Toast.makeText(this, "წარმატებით გაიგზავნა", Toast.LENGTH_SHORT).show()
                }
            }else if (ki.isChecked && ara.isChecked){
                Toast.makeText(this, "გთხოვთ სწორად უპასუხეთ პირველ კითხვას", Toast.LENGTH_SHORT).show()
            }

        }


    }
}