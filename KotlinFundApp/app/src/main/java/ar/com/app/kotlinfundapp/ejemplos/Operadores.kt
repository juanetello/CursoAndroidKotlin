package ar.com.app.kotlinfundapp.ejemplos

import android.util.Log

class Operadores {

    var a = Figura("Cuadrado")
    var b = Figura("Cuadrado")

    fun workEquals(){
        a=b
        Log.i("CASE_OPER", "Igualdad referencial.. Es A igual a B? ${a === b}") //false
        Log.i("CASE_OPER", "Igualdad estructural.. Es A igual a B? ${a == b}")
    }

    fun workEqualsDataClass(){
        var c = FiguraV2("Cuadrado")
        var d = FiguraV2("Cuadrado")
        var e = FiguraV2("Circulo")

        Log.i("CASE_OPER", "Igualdad referencial Es C igual a D? ${c ===d}")
        Log.i("CASE_OPER", "Igualdad estructural Es C igual a D? ${c == d}")
        Log.i("CASE_OPER", "Igualdad estructural Es D igual a E? ${d == e}")
    }

    data class FiguraV2(val nombre : String)


}