package com.example.a12_04_2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val auta = arrayOf("mercedes", "audi", "kia")
        val adapter = CustomAdapter(auta)

        val manager = LinearLayoutManager(this)
        val recycler = findViewById<RecyclerView>(R.id.recycle)
        recycler.adapter = adapter

        recycler.layoutManager = manager
    }
}