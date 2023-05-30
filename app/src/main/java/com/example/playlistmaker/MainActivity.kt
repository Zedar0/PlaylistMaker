package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSearch = findViewById<Button>(R.id.button_search)
        buttonSearch.setOnClickListener {
            val searchIntent = Intent(this, SearchActivity::class.java)
            startActivity(searchIntent)
        }
        val buttonLibrary = findViewById<Button>(R.id.button_library)
        buttonLibrary.setOnClickListener {
            val libraryIntent = Intent(this, LibraryActivity::class.java)
            startActivity(libraryIntent)
        }
        val buttonSetting = findViewById<Button>(R.id.button_setting)
        buttonSetting.setOnClickListener {
            val settingIntent = Intent(this, SettingsActivity::class.java)
            startActivity(settingIntent)
        }
    }
}