package com.example.saludo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    /* 2do metodo
    private lateinit var btn1 : Button
    private lateinit var msg : TextView
    private lateinit var nombre : EditText
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /* 2do metodo

        btn1 = findViewById<Button>(R.id.btn_1)
        msg = findViewById<TextView>(R.id.mensaje)
        nombre = findViewById<EditText>(R.id.name)

         */

        /* 1er metodo */
        val btn1 = findViewById<Button>(R.id.btn_1)
        val msg = findViewById<TextView>(R.id.mensaje)
        val nombre = findViewById<EditText>(R.id.name)


        btn1.setOnClickListener{
            val nom = nombre.text.toString()
            if (nom.isEmpty()){
                Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else {
                msg.text = "Hola $nom" + " ¿Como estas?"
            }

            Toast.makeText(this, "Hola $nom" + " ¿Como estas?", Toast.LENGTH_SHORT).show()
            }

         /* 1er metodo */

    }
    /* 2do metodo
    fun saludar(view: View) {
        val nom = nombre.text.toString()
        if (nom.isEmpty()){
            Toast.makeText(this, "Escribe tu nombre", Toast.LENGTH_SHORT).show()
            return
        }
        else {
            msg.text = "Hola $nom" + " ¿Como estas?"
        }

        Toast.makeText(this, "Hola $nom" + " ¿Como estas?", Toast.LENGTH_SHORT).show()
    }
     */
}