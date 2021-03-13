package com.example.pf02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miTexto = findViewById<TextView>(R.id.txtTitulo)
        miTexto.text = "Daniel Pale Parra"

        val miLista = findViewById<ListView>(R.id.listaItems)
        miLista.adapter = miAdaptador(this)
    }
}