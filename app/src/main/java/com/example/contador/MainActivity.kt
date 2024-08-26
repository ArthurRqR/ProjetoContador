package com.example.contador
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contadorText = findViewById<TextView>(R.id.contador_text)
        val menosButton = findViewById<Button>(R.id.menos_button)
        val maisButton = findViewById<Button>(R.id.mais_button)

        menosButton.setOnClickListener {
            contador--
            contadorText.text = contador.toString()
        }

        maisButton.setOnClickListener {
            contador++
            contadorText.text = contador.toString()
        }
    }
}