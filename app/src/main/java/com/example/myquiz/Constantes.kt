package com.example.myquiz

object Constantes {

    const val USER_NAME : String = "nome_do_usuário"
    const val TOTAL_QUESTIONS : String = "total_de_perguntas"
    const val CORRECT_ANSWER : String = "respostas_certas"

    fun puxarPerguntas(): ArrayList<Pergunta> {
        val listaDePerguntas = ArrayList<Pergunta>()
        val per1 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armênia", "Austria",
            1
        )
        listaDePerguntas.add(per1)

        val per2 = Pergunta(
            2, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_australia,
            "Brasil", "Australia",
            "Reino Unido", "Austria",
            2
        )
        listaDePerguntas.add(per2)

        val per3 = Pergunta(
            3, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_belgium,
            "Bélgica", "Alemanha",
            "Russia", "África",
            1
        )
        listaDePerguntas.add(per3)

        val per4 = Pergunta(
            4, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_brazil,
            "Brasil", "Bolívia",
            "México", "Peru",
            1
        )
        listaDePerguntas.add(per4)

        val per5 = Pergunta(
            5, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_denmark,
            "Groenlândia", "Italia",
            "França", "Dinamarca",
            4
        )
        listaDePerguntas.add(per5)

        val per6 = Pergunta(
            6, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_fiji,
            "Estados Unidos", "Paquistão",
            "Fiji", "Bolívia",
            3
        )
        listaDePerguntas.add(per6)

        val per7 = Pergunta(
            7, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_germany,
            "Chile", "Russia",
            "Alemanha", "Columbia",
            3
        )
        listaDePerguntas.add(per7)

        val per8 = Pergunta(
            8, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_india,
            "Índia", "Paquistão",
            "Japão", "China",
            1
        )
        listaDePerguntas.add(per8)

        val per9 = Pergunta(
            9, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_kuwait,
            "África do Sul", "Kuwait",
            "Egito", "Cuba",
            2
        )
        listaDePerguntas.add(per9)

        val per10 = Pergunta(
            10, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_new_zealand,
            "Alasca", "Coréia do Sul",
            "Grécia", "Nova Zelândia",
            4
        )
        listaDePerguntas.add(per10)

        return listaDePerguntas
    }
}