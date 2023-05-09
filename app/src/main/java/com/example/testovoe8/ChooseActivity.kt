package com.example.testovoe8

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide

class ChooseActivity : AppCompatActivity() {

    private lateinit var imageViewFon2: ImageView
    private lateinit var textViewDay: TextView

    private lateinit var buttonWorkout: AppCompatButton
    private lateinit var buttonNutrition: AppCompatButton

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        buttonWorkout = findViewById(R.id.buttonWorkout)
        buttonNutrition = findViewById(R.id.buttonNutrition)
        textViewDay = findViewById(R.id.textViewDay)
        imageViewFon2 = findViewById(R.id.imageViewFon2)

        Glide.with(this)
            .load("http://135.181.248.237/8/fon3.png")
            .into(imageViewFon2)

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        val day = sharedPreferences.getInt("day",1)
        when(day) {
            1 -> textViewDay.setText("DAY ONE")
            2 -> textViewDay.setText("DAY TWO")
            3 -> textViewDay.setText("DAY THREE")
            4 -> textViewDay.setText("DAY FOUR")
            5 -> textViewDay.setText("DAY FIVE")
            6 -> textViewDay.setText("DAY SIX")
            7 -> textViewDay.setText("DAY SEVEN")
            8 -> textViewDay.setText("DAY EIGHT")
            9 -> textViewDay.setText("DAY NINE")
            10 -> textViewDay.setText("DAY TEN")
            11 -> textViewDay.setText("DAY ELEVEN")
            12 -> textViewDay.setText("DAY TWELVE")
            13 -> textViewDay.setText("DAY THIRTEEN")
            14 -> textViewDay.setText("DAY FOURTEEN")
            15 -> textViewDay.setText("DAY FIFTEEN")
            16 -> textViewDay.setText("DAY SIXTEEN")
            17 -> textViewDay.setText("DAY SEVENTEEN")
            18 -> textViewDay.setText("DAY EIGHTEEN")
            19 -> textViewDay.setText("DAY NINETEEN")
            20 -> textViewDay.setText("DAY TWENTY")
            21 -> textViewDay.setText("DAY TWENTY-ONE")
            22 -> textViewDay.setText("DAY TWENTY-TWO")
            23 -> textViewDay.setText("DAY TWENTY-THREE")
            24 -> textViewDay.setText("DAY TWENTY-FOUR")
            25 -> textViewDay.setText("DAY TWENTY-FIVE")
            26 -> textViewDay.setText("DAY TWENTY-SIX")
            27 -> textViewDay.setText("DAY TWENTY-SEVEN")
            28 -> textViewDay.setText("DAY TWENTY-EIGHT")
            29 -> textViewDay.setText("DAY TWENTY-NINE")
            30 -> textViewDay.setText("DAY THIRTY")
        }
        buttonNutrition.setOnClickListener {
            val intent = Intent(this, NutritionActivity::class.java)
            startActivity(intent)
        }
        buttonWorkout.setOnClickListener {
            val intent = Intent(this, WorkoutActivity::class.java)
            startActivity(intent)
        }
    }
}