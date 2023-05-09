package com.example.testovoe8

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class WeightActivity : AppCompatActivity() {

    private lateinit var imageViewFon2: ImageView
    private lateinit var editTextWeight: EditText
    private lateinit var buttonAdd: AppCompatButton
    private lateinit var textViewHistory: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)

        imageViewFon2 = findViewById(R.id.imageViewFon2)
        editTextWeight = findViewById(R.id.editTextWeight)
        buttonAdd = findViewById(R.id.buttonAdd)
        textViewHistory = findViewById(R.id.textViewHistory)

        Glide.with(this)
            .load("http://135.181.248.237/8/fon3.png")
            .into(imageViewFon2)

        val sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        textViewHistory.text = sharedPreferences.getString("allText", "")
        var lastWeight = sharedPreferences.getFloat("weight", 0f)

        buttonAdd.setOnClickListener {
            if (TextUtils.isEmpty(editTextWeight.text)) {
                editTextWeight.setBackgroundResource(R.drawable.rounded_edittext_red)
            } else {
                editTextWeight.setBackgroundResource(R.drawable.rounded_edittext)
                val weightText = editTextWeight.text.toString()
                val weight = weightText.toFloat()
                val currentDateTime = LocalDateTime.now()
                val formatter = DateTimeFormatter.ofPattern("dd.MM")
                val formattedDateTime = currentDateTime.format(formatter)
                val raznica = weight - lastWeight
                val raznicaStr = "%.1f".format(raznica)
                val lastText = textViewHistory.text
                if (raznica > 0) {
                    val result = formattedDateTime.toString()+"  "+weightText+"kg   +"+raznicaStr+"kg\n"
                    textViewHistory.text =result+lastText
                } else {
                    val result = formattedDateTime.toString()+"  "+weightText+"kg   "+raznicaStr+"kg\n"
                    textViewHistory.text =result+lastText
                }
                editTextWeight.setText("")
                lastWeight=weight
                val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()
                editor.putFloat("weight", weight)
                editor.putString("allText", textViewHistory.text.toString())
                editor.apply()
            }
        }
    }
}