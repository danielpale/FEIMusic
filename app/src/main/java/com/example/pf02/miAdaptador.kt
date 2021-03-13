package com.example.pf02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class miAdaptador(contexto:Context):BaseAdapter() {

    private val miContexto : Context

    init{
        miContexto = contexto
    }

    //Generar cada una de las filas
    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        /*val layoutInflater = LayoutInflater.from(miContexto)
        val listRowLayout = layoutInflater.inflate(R.layout.fila_lista,viewGroup, false)

        val txtDescripcion = listRowLayout.findViewById<TextView>(R.id.txt_descripcion)
        txtDescripcion.text = "Hola soy la fila # $position"

        return listRowLayout*/

        val texto = TextView(miContexto)
        texto.text = "Me encontré el fortnite y lo juego todo el día $position"
        return texto
    }


    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    //Regresa el id de cada elemento de la lista
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //Cuantas filas se generan
    override fun getCount(): Int {
        return 10
    }
}