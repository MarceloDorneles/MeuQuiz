package com.example.myquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizPerguntasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_perguntas)

        val listaDePerguntas = Constantes.puxarPerguntas()
        Log.i("O tamanho da lista é", "${listaDePerguntas.size}")
    }
}