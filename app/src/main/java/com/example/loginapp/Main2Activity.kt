package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.order_layout.*

class Main2Activity : AppCompatActivity() {

    private var extraIngredient = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_layout)

        val textFromActivity = intent.getStringExtra(STRING_KEY)
        Toast.makeText(this, textFromActivity, Toast.LENGTH_SHORT).show()

        radio.setOnCheckedChangeListener { group, position ->
            extraIngredient = (group[position - 1] as RadioButton).text.toString()
            Toast.makeText(this, (group[position - 1] as RadioButton).text.toString(), Toast.LENGTH_SHORT).show()
        }

        checkbox.isChecked

    }

    private fun navigateToNext() {
        val intent = Intent()
        var ingredients = "";

        if(checkbox.isChecked) {
            ingredients.plus(checkbox.text).plus(", ")
        }
    }
}
