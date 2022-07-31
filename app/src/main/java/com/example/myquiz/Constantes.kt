package com.example.myquiz

object Constantes {
    fun puxarPerguntas(): ArrayList<Pergunta> {
        val listaDePerguntas = ArrayList<Pergunta>()
        val Per1 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armênia", "Austria",
            1
        )
        listaDePerguntas.add(Per1)

        val Per2 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_australia,
            "Brasil", "Australia",
            "Reino Unido", "Austria",
            2
        )
        listaDePerguntas.add(Per2)

        val Per3 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_belgium,
            "Bélgica", "Alemanha",
            "Russia", "África",
            1
        )
        listaDePerguntas.add(Per3)

        val Per4 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_brazil,
            "Brasil", "Bolívia",
            "México", "Peru",
            1
        )
        listaDePerguntas.add(Per4)

        val Per5 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_denmark,
            "Groenlândia", "Italia",
            "França", "Dinamarca",
            4
        )
        listaDePerguntas.add(Per5)

        val Per6 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_fiji,
            "Estados Unidos", "Paquistão",
            "Fiji", "Bolívia",
            3
        )
        listaDePerguntas.add(Per6)

        val Per7 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_germany,
            "Chile", "Russia",
            "Alemanha", "Columbia",
            3
        )
        listaDePerguntas.add(Per7)

        val Per8 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_india,
            "Índia", "Paquistão",
            "Japão", "China",
            1
        )
        listaDePerguntas.add(Per8)

        val Per9 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_kuwait,
            "África do Sul", "Kuwait",
            "Egito", "Cuba",
            2
        )
        listaDePerguntas.add(Per9)

        val Per10 = Pergunta(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_new_zealand,
            "Alasca", "Coréia do Sul",
            "Grécia", "Nova Zelândia",
            1
        )
        listaDePerguntas.add(Per10)

        return listaDePerguntas
    }
}