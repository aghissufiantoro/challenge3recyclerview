package com.example.challenge3recyclerview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val images = listOf<Int>(
            R.drawable.lauk,
            R.drawable.makanan_tradisional,
            R.drawable.sayur,
            R.drawable.susu,
        )

        val names = listOf<String>(
            "Nasi Ayam Geprek",
            "Nasi Ayam Suwir",
            "Nasi Ayam Krispi",
            "Nasi Ayam Ayaman",

        )

        val mainAdapter = MainAdapter(names)
        findViewById<RecyclerView>(R.id.list_menu_makanan). adapter = mainAdapter

        val imageAdapter = ImageAdapter( images )
        findViewById<RecyclerView>(R.id.list_menu_makanan). adapter = imageAdapter


    }


}