package com.example.myquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat


class QuizPerguntasActivity : AppCompatActivity(), View.OnClickListener {

    private var mPosicaoAtual: Int = 1
    private var mListaDePerguntas: ArrayList <Pergunta>? = null
    private var mPosicaoDeOpniaoSelecionada : Int = 0

    private var mNomeDeUsuario : String? = null
    private var mRespostasCertas: Int = 0


    private var barraDeProgresso : ProgressBar? = null
    private var tvProgresso : TextView? = null
    private var tvQuestao : TextView? = null
    private var ivImagem : ImageView? = null

    private var tvOpcaoUm : TextView? = null
    private var tvOpcaoDois : TextView? = null
    private var tvOpcaoTres : TextView? = null
    private var tvOpcaoQuatro : TextView? = null
    private var btnEnviar : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_perguntas)

        mNomeDeUsuario = intent.getStringExtra(Constantes.USER_NAME)

        barraDeProgresso = findViewById(R.id.progressBar)
        tvProgresso = findViewById(R.id.tv_progress)
        tvQuestao = findViewById(R.id.tv_pergunta)
        ivImagem = findViewById(R.id.iv_imagem)

        tvOpcaoUm = findViewById(R.id.tv_opcao_um)
        tvOpcaoDois = findViewById(R.id.tv_opcao_dois)
        tvOpcaoTres = findViewById(R.id.tv_opcao_tres)
        tvOpcaoQuatro = findViewById(R.id.tv_opcao_quatro)
        btnEnviar = findViewById(R.id.btn_submit)

        tvOpcaoUm?.setOnClickListener(this)
        tvOpcaoDois?.setOnClickListener(this)
        tvOpcaoTres?.setOnClickListener(this)
        tvOpcaoQuatro?.setOnClickListener(this)
        btnEnviar?.setOnClickListener(this)

        mListaDePerguntas = Constantes.puxarPerguntas()

        selecionarPergunta()

    }

    private fun selecionarPergunta() {

        viewDeOpcoesPadrao()

        val pergunta: Pergunta = mListaDePerguntas!![mPosicaoAtual - 1]
        barraDeProgresso?.progress = mPosicaoAtual
        ivImagem?.setImageResource(pergunta.imagem)
        tvProgresso?.text = "$mPosicaoAtual/${barraDeProgresso?.max}"
        tvQuestao?.text = pergunta.pergunta
        tvOpcaoUm?.text = pergunta.opcaoUm
        tvOpcaoDois?.text = pergunta.opcaoDois
        tvOpcaoTres?.text = pergunta.opcaoTres
        tvOpcaoQuatro?.text = pergunta.opcaoQuatro

        if(mPosicaoAtual == mListaDePerguntas!!.size){
            btnEnviar?.text = "TERMINAR"
        } else {
            btnEnviar?.text = "ENVIAR"
        }
    }

    private fun viewDeOpcoesPadrao(){
        val options = ArrayList<TextView>()
        tvOpcaoUm?.let{
            options.add(0, it)
        }
        tvOpcaoDois?.let{
            options.add(1, it)
        }
        tvOpcaoTres?.let{
            options.add(2, it)
        }
        tvOpcaoQuatro?.let{
            options.add(3, it)
        }

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )

        }

    }

    private fun viewDeOpcaoSelecionada(tv: TextView, numeroDaOpcaoSelecionada : Int){
        viewDeOpcoesPadrao()

        mPosicaoDeOpniaoSelecionada = numeroDaOpcaoSelecionada

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )
    }


    override fun onClick(view : View?) {

        when(view?.id){
            R.id.tv_opcao_um ->{
                tvOpcaoUm?.let{
                    viewDeOpcaoSelecionada(it, 1)
                }
            }
            R.id.tv_opcao_dois ->{
                tvOpcaoDois?.let{
                    viewDeOpcaoSelecionada(it, 2)
                }
            }
            R.id.tv_opcao_tres ->{
                tvOpcaoTres?.let{
                    viewDeOpcaoSelecionada(it, 3)
                }
            }
            R.id.tv_opcao_quatro ->{
                tvOpcaoQuatro?.let{
                    viewDeOpcaoSelecionada(it, 4)
                }
            }

            R.id.btn_submit ->{
                if(mPosicaoDeOpniaoSelecionada == 0){
                    mPosicaoAtual++

                    when{
                        mPosicaoAtual <= mListaDePerguntas!!.size ->{
                            selecionarPergunta()
                        }
                        else ->{
                            val intent = Intent(this, ResultadoActivity::class.java)
                            intent.putExtra(Constantes.USER_NAME, mNomeDeUsuario)
                            intent.putExtra(Constantes.CORRECT_ANSWER, mRespostasCertas)
                            intent.putExtra(Constantes.TOTAL_QUESTIONS, mListaDePerguntas?.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }else{
                    val pergunta = mListaDePerguntas?.get(mPosicaoAtual -1)
                    if(pergunta!!.respostaCerta!= mPosicaoDeOpniaoSelecionada){
                        viewResposta(mPosicaoDeOpniaoSelecionada, R.drawable.wrong_option_border_bg)
                    }else{
                        mRespostasCertas++
                    }
                    viewResposta(pergunta.respostaCerta, R.drawable.correct_option_border_bg)

                    if(mPosicaoAtual ==mListaDePerguntas!!.size){
                        btnEnviar?.text = "Terminar"
                    }else{
                        btnEnviar?.text = "VÁ PARA A PRÓXIMA PERGUNTA"
                    }

                    mPosicaoDeOpniaoSelecionada = 0
                }
            }
        }
    }

    private fun viewResposta (resposta: Int, drawableView: Int ) {
        when(resposta){
            1 -> {
                tvOpcaoUm?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 -> {
                tvOpcaoDois?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 -> {
                tvOpcaoTres?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 -> {
                tvOpcaoQuatro?.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }

    }



}