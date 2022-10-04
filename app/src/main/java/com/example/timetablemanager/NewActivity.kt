package com.example.timetablemanager

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)

        val btn_click_me = findViewById(R.id.savetask) as Button
// set on-click listener
        btn_click_me.setOnClickListener {
            Toast.makeText(this@NewActivity, "Task Saved.", Toast.LENGTH_SHORT).show()
        }
    }
}