package com.example.henrik.svampkorgen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with mushrooms
    val mushrooms: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Loads mushrooms into the ArrayList
        addMushrooms()

        // Creates a vertical Layout Manager
        rv_mushroom_list.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
        // rv_mushroom_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        rv_mushroom_list.adapter = MushroomAdapter(mushrooms, this)

    }

    // Adds mushrooms to the empty mushroom ArrayList
    fun addMushrooms() {
        mushrooms.add("Kantarell")
        mushrooms.add("Stensopp")
        mushrooms.add("Brunsopp")
        mushrooms.add("Kantarell")
        mushrooms.add("Stensopp")
        mushrooms.add("Brunsopp")
        mushrooms.add("Kantarell")
        mushrooms.add("Stensopp")
        mushrooms.add("Brunsopp")
    }
}
