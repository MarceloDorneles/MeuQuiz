package com.example.myquiz

data class Pergunta(
    val id : Int,
    val pergunta : String,
    val imagem : Int,

    val opcaoUm : String,
    val opcaoDois : String,
    val opcaoTres : String,
    val opcaoQuatro : String,
    val respostaCerta : Int
)
