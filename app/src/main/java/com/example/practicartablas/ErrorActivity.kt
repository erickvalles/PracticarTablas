package com.example.practicartablas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_error.*

class ErrorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)

        val textoOperacion = intent.getStringExtra("operacion")
        val intResultado = intent.getIntExtra("resultado",0)


        tvOperacionError.text = textoOperacion
        tvRespuestaCorrecta.text = "$intResultado"

    }
}
