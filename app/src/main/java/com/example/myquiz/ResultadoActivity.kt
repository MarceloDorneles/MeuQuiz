 package com.example.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

 class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val tvNome : TextView = findViewById(R.id.tv_name)
        val tvPontuacao : TextView = findViewById(R.id.tv_pontuação)
        val btFinal : Button = findViewById(R.id.bt_final)

        tvNome.text = intent.getStringExtra(Constantes.USER_NAME)

        val perguntasTotal = intent.getIntExtra(Constantes.TOTAL_QUESTIONS, 0)
        val respostasCertas = intent.getIntExtra(Constantes.CORRECT_ANSWER, 0)

        tvPontuacao.text = "Sua Pontuação é $respostasCertas de $perguntasTotal"

        btFinal.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}