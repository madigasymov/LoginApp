package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private const val LOGIN = "damu@fund.kz"
private const val PASSWORD = "qwerty123"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLgn.setOnClickListener {
            if (etLgn.text.toString() == LOGIN && etPsw.text.toString() == PASSWORD) {
                Toast.makeText(this, "SUCCESS", Toast.LENGTH_LONG).show()
            }
            else if (etLgn.text.toString() == LOGIN) {
                Toast.makeText(this, "Wrong Password!", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Wrong Login/Password!", Toast.LENGTH_LONG).show()
            }
        }

        btnReg.setOnClickListener {Toast.makeText(this, "REGISTRATION", Toast.LENGTH_LONG).show()}
        frgt.setOnClickListener {Toast.makeText(this, "Forgot password", Toast.LENGTH_LONG).show()}
    }
}
