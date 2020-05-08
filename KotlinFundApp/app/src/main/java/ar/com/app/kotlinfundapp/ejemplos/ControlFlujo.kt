package ar.com.app.kotlinfundapp.ejemplos

import android.util.Log

class ControlFlujo {

    fun workExpression(){
        var numeroUno = 120
        var numeroDos = 20

        if (numeroUno > numeroDos){
            Log.i("CASE_IF", "NumeroUno es mayor que NumeroDos")
        } else{
            Log.i("CASE_IF", "NumeroDos es mayor que NumeroUno")
        }

        //Como EXPRESION
        if (numeroUno > numeroDos) Log.i("CASE_IF_EXPRESSION", "Numero uno es mayor que Numero dos") else
            Log.i("CASE_IF", "NumeroDos es mayor que NumeroUno")

    }


    fun workWhen(){
        //When es similar a switch en JAVA

        var variableUno = 6
        when(variableUno){
            1 -> Log.i("CASE_WHEN", "$variableUno ==1")
            2 -> Log.i("CASE_WHEN", "$variableUno ==2")
            else -> Log.i("CASE_WHEN", "$variableUno es otro numero")
        }

        when(variableUno){
            0,1 -> Log.i("CASE_WHEN", "$variableUno == 0 o $variableUno == 1")
        }

        /*Sin argumentos y devolviendo un valor*/

        when{
            (variableUno % 2 == 0) -> Log.i("CASE_WHEN", "numero par...")
            (variableUno % 2 == 1) -> Log.i("CASE_WHEN", "numero par...")

        }

        var esPar = when{
            (variableUno % 2 == 0) -> true else
                -> false
        }
    }
}