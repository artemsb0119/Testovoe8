package com.example.testovoe8

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL

class NutritionActivity : AppCompatActivity() {

    private lateinit var nutrition: List<Nutrition>
    private lateinit var activity: Activity
    private lateinit var imageViewFon2: ImageView

    private lateinit var viewpager: ViewPager2
    private lateinit var buttonNext: AppCompatButton
    private lateinit var adapter: NutritionAdapter

    private lateinit var url: String

    private var currentItemIndex = 0

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition)

        buttonNext = findViewById(R.id.buttonNext)
        viewpager = findViewById(R.id.viewpager)
        imageViewFon2 = findViewById(R.id.imageViewFon2)
        activity = this

        Glide.with(this)
            .load("http://135.181.248.237/8/fon3.png")
            .into(imageViewFon2)

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        val day = sharedPreferences.getInt("day", 1)
        when (day) {
            1 -> url = "http://135.181.248.237/8/monday.json"
            2 -> url = "http://135.181.248.237/8/tuesday.json"
            3 -> url = "http://135.181.248.237/8/wednesday.json"
            4 -> url = "http://135.181.248.237/8/thursday.json"
            5 -> url = "http://135.181.248.237/8/friday.json"
            6 -> url = "http://135.181.248.237/8/saturday.json"
            7 -> url = "http://135.181.248.237/8/sunday.json"
            8 -> url = "http://135.181.248.237/8/monday.json"
            9 -> url = "http://135.181.248.237/8/tuesday.json"
            10 ->url = "http://135.181.248.237/8/wednesday.json"
            11 ->url = "http://135.181.248.237/8/thursday.json"
            12 ->url = "http://135.181.248.237/8/friday.json"
            13 ->url = "http://135.181.248.237/8/saturday.json"
            14 ->url = "http://135.181.248.237/8/sunday.json"
            15 -> url = "http://135.181.248.237/8/monday.json"
            16 -> url = "http://135.181.248.237/8/tuesday.json"
            17 -> url = "http://135.181.248.237/8/wednesday.json"
            18 -> url = "http://135.181.248.237/8/thursday.json"
            19 -> url = "http://135.181.248.237/8/friday.json"
            20 -> url = "http://135.181.248.237/8/saturday.json"
            21 -> url = "http://135.181.248.237/8/sunday.json"
            22 -> url = "http://135.181.248.237/8/monday.json"
            23 -> url = "http://135.181.248.237/8/tuesday.json"
            24 -> url = "http://135.181.248.237/8/wednesday.json"
            25 -> url = "http://135.181.248.237/8/thursday.json"
            26 -> url = "http://135.181.248.237/8/friday.json"
            27 -> url = "http://135.181.248.237/8/saturday.json"
            28 -> url = "http://135.181.248.237/8/sunday.json"
            29 -> url = "http://135.181.248.237/8/monday.json"
            30 -> url = "http://135.181.248.237/8/tuesday.json"
        }

        loadData()
    }

    private fun loadData() {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val data = URL(url).readText()
                val gson = Gson()
                nutrition = gson.fromJson(data, Array<Nutrition>::class.java).toList()

                activity.runOnUiThread {
                    adapter = NutritionAdapter(nutrition)
                    viewpager.adapter = adapter
                    viewpager.clipToPadding = false
                    viewpager.clipChildren = false
                    viewpager.offscreenPageLimit = 2
                    buttonNext.setOnClickListener {
                        currentItemIndex = viewpager.currentItem
                        currentItemIndex++
                        if (currentItemIndex >= nutrition.size) {
                            currentItemIndex = 0
                        }
                        viewpager.setCurrentItem(currentItemIndex, true)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}