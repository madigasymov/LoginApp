package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textFromActivity = intent.getStringExtra(STRING_KEY)
        Toast.makeText(this, textFromActivity, Toast.LENGTH_SHORT).show()
    }
}
