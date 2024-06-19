package com.projeto06.projeto06

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnProsseguir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnProsseguir = findViewById(R.id.btn_Primeira_Tela)

        btnProsseguir.setOnClickListener {

            val intent = Intent(this, SegundaTela::class.java)

            startActivity(intent)
        }
    }
}