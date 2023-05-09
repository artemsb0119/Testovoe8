package com.example.testovoe8

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URL

class WorkoutActivity : AppCompatActivity() {

    private lateinit var activity: Activity
    private lateinit var imageViewFon2: ImageView
    private lateinit var workout: List<Workout>

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: WorkoutAdapter

    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout)

        recyclerView = findViewById(R.id.rv_table)
        recyclerView.layoutManager = LinearLayoutManager(this)
        activity = this

        imageViewFon2 = findViewById(R.id.imageViewFon2)

        Glide.with(this)
            .load("http://135.181.248.237/8/fon3.png")
            .into(imageViewFon2)

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        val day = sharedPreferences.getInt("day", 1)
        when (day) {
            1 -> url = "http://135.181.248.237/8/mass_monday.json"
            2 -> url = "http://135.181.248.237/8/relief_monday.json"
            3 -> url = "http://135.181.248.237/8/mass_monday.json"
            4 -> url = "http://135.181.248.237/8/universal_monday.json"
            5 -> url = "http://135.181.248.237/8/mass_tuesday.json"
            6 -> url = "http://135.181.248.237/8/relief_tuesday.json"
            7 -> url = "http://135.181.248.237/8/mass_tuesday.json"
            8 -> url = "http://135.181.248.237/8/universal_tuesday.json"
            9 -> url = "http://135.181.248.237/8/mass_wednesday.json"
            10 -> url = "http://135.181.248.237/8/relief_wednesday.json"
            11 -> url = "http://135.181.248.237/8/mass_wednesday.json"
            12 -> url = "http://135.181.248.237/8/universal_wednesday.json"
            13 -> url = "http://135.181.248.237/8/mass_thursday.json"
            14 -> url = "http://135.181.248.237/8/relief_thursday.json"
            15 -> url = "http://135.181.248.237/8/mass_thursday.json"
            16 -> url = "http://135.181.248.237/8/universal_thursday.json"
            17 -> url = "http://135.181.248.237/8/mass_friday.json"
            18 -> url = "http://135.181.248.237/8/relief_friday.json"
            19 -> url = "http://135.181.248.237/8/mass_friday.json"
            20 -> url = "http://135.181.248.237/8/universal_friday.json"
            21 -> url = "http://135.181.248.237/8/mass_monday.json"
            22 -> url = "http://135.181.248.237/8/relief_monday.json"
            23 -> url = "http://135.181.248.237/8/mass_monday.json"
            24 -> url = "http://135.181.248.237/8/universal_monday.json"
            25 -> url = "http://135.181.248.237/8/mass_tuesday.json"
            26 -> url = "http://135.181.248.237/8/relief_tuesday.json"
            27 -> url = "http://135.181.248.237/8/mass_tuesday.json"
            28 -> url = "http://135.181.248.237/8/universal_tuesday.json"
            29 -> url = "http://135.181.248.237/8/mass_wednesday.json"
            30 -> url = "http://135.181.248.237/8/relief_wednesday.json"
        }
        loadData()
    }

    private fun loadData() {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val data = URL(url).readText()
                val gson = Gson()
                workout = gson.fromJson(data, Array<Workout>::class.java).toList()

                activity.runOnUiThread {
                    adapter = WorkoutAdapter(workout)
                    recyclerView.adapter = adapter
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}