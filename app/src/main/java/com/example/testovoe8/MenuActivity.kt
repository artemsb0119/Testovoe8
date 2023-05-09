package com.example.testovoe8

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide

class MenuActivity : AppCompatActivity() {

    private lateinit var button1: AppCompatButton
    private lateinit var button2: AppCompatButton
    private lateinit var button3: AppCompatButton
    private lateinit var button4: AppCompatButton
    private lateinit var button5: AppCompatButton
    private lateinit var button6: AppCompatButton
    private lateinit var button7: AppCompatButton
    private lateinit var button8: AppCompatButton
    private lateinit var button9: AppCompatButton
    private lateinit var button10: AppCompatButton
    private lateinit var button11: AppCompatButton
    private lateinit var button12: AppCompatButton
    private lateinit var button13: AppCompatButton
    private lateinit var button14: AppCompatButton
    private lateinit var button15: AppCompatButton
    private lateinit var button16: AppCompatButton
    private lateinit var button17: AppCompatButton
    private lateinit var button18: AppCompatButton
    private lateinit var button19: AppCompatButton
    private lateinit var button20: AppCompatButton
    private lateinit var button21: AppCompatButton
    private lateinit var button22: AppCompatButton
    private lateinit var button23: AppCompatButton
    private lateinit var button24: AppCompatButton
    private lateinit var button25: AppCompatButton
    private lateinit var button26: AppCompatButton
    private lateinit var button27: AppCompatButton
    private lateinit var button28: AppCompatButton
    private lateinit var button29: AppCompatButton
    private lateinit var button30: AppCompatButton

    private lateinit var buttonWeight: AppCompatButton
    private lateinit var buttonSettings: AppCompatButton

    private lateinit var imageViewFon2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        imageViewFon2 = findViewById(R.id.imageViewFon2)

        Glide.with(this)
            .load("http://135.181.248.237/8/fon3.png")
            .into(imageViewFon2)

        val editor = getSharedPreferences("my_preferences", Context.MODE_PRIVATE).edit()

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        button10 = findViewById(R.id.button10)
        button11 = findViewById(R.id.button11)
        button12 = findViewById(R.id.button12)
        button13 = findViewById(R.id.button13)
        button14 = findViewById(R.id.button14)
        button15 = findViewById(R.id.button15)
        button16 = findViewById(R.id.button16)
        button17 = findViewById(R.id.button17)
        button18 = findViewById(R.id.button18)
        button19 = findViewById(R.id.button19)
        button20 = findViewById(R.id.button20)
        button21 = findViewById(R.id.button21)
        button22 = findViewById(R.id.button22)
        button23 = findViewById(R.id.button23)
        button24 = findViewById(R.id.button24)
        button25 = findViewById(R.id.button25)
        button26 = findViewById(R.id.button26)
        button27 = findViewById(R.id.button27)
        button28 = findViewById(R.id.button28)
        button29 = findViewById(R.id.button29)
        button30 = findViewById(R.id.button30)

        buttonWeight = findViewById(R.id.buttonWeight)
        buttonSettings = findViewById(R.id.buttonSettings)

        button1.setOnClickListener {
            editor.putInt("day", 1)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            editor.putInt("day", 2)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            editor.putInt("day", 3)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            editor.putInt("day", 4)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            editor.putInt("day", 5)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            editor.putInt("day", 6)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            editor.putInt("day", 7)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            editor.putInt("day", 8)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {
            editor.putInt("day", 9)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {
            editor.putInt("day", 10)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener {
            editor.putInt("day", 11)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button12.setOnClickListener {
            editor.putInt("day", 12)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener {
            editor.putInt("day", 13)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button14.setOnClickListener {
            editor.putInt("day", 14)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button15.setOnClickListener {
            editor.putInt("day", 15)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button16.setOnClickListener {
            editor.putInt("day", 16)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button17.setOnClickListener {
            editor.putInt("day", 17)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button18.setOnClickListener {
            editor.putInt("day", 18)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            editor.putInt("day", 19)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button20.setOnClickListener {
            editor.putInt("day", 20)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button21.setOnClickListener {
            editor.putInt("day", 21)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            editor.putInt("day", 22)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            editor.putInt("day", 23)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button24.setOnClickListener {
            editor.putInt("day", 24)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button25.setOnClickListener {
            editor.putInt("day", 25)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button26.setOnClickListener {
            editor.putInt("day", 26)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button27.setOnClickListener {
            editor.putInt("day", 27)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button28.setOnClickListener {
            editor.putInt("day", 28)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button29.setOnClickListener {
            editor.putInt("day", 29)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button30.setOnClickListener {
            editor.putInt("day", 30)
            editor.apply()
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        buttonWeight.setOnClickListener {
            val intent = Intent(this, WeightActivity::class.java)
            startActivity(intent)
        }
        buttonSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}