package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private const val LOGIN = "damu@fund.kz"
private const val PASSWORD = "qwerty123"
const val STRING_KEY = "KEY"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLgn.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra(STRING_KEY, etLgn.text.toString())
            startActivity(intent)
        }

        btnReg.setOnClickListener {Toast.makeText(this, "REGISTRATION", Toast.LENGTH_LONG).show()}
        frgt.setOnClickListener {Toast.makeText(this, "Forgot password", Toast.LENGTH_LONG).show()}
    }
}
