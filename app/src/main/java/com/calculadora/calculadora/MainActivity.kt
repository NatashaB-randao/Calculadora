package com.calculadora.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
    }

    fun AcrescentarUmaExpressao(string: String, limpar_dados : Boolean){

        if (R.id.resultado.text.isNotEmpty){
            R.id.expressao.text = ""
        }

        if (limpar_dados){
            R.id.resultado.text = ""
            R.id.expressao.append(string)

        }else{
            R.id.expressao.append(R.id.resultado.text)
        }
    }



}