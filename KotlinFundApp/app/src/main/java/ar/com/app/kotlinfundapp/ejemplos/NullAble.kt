package ar.com.app.kotlinfundapp.ejemplos

import android.util.Log

/**
 * 1- Llamada explicita al error NPE
 * 2- Uso del operado !!
 * 3- Codigo externo Java
 * 4- Alguna inconsistencia de datos en relacion a la inicializacion
 */
class NullAble {
    private lateinit var variable1 : String // Se inicializa despues
    private var  variable2 : String? = null

    /**
     * 1
     */
    fun workNullPointerException() : NullPointerException{
        return NullPointerException()
    }

    /**
     * 2
     */
    fun workOnlySafe(var1 : String?){
        Log.e("CASE_NULL", var1.toString())
        //Log.e("CASE_NULL", var1!!.toString()) // lanza null pointer exception
    }

    /**
     * 3
     */
    fun workCallJavaClass(){
        Log.e("CASE_NULL", ClaseJava.getNullPointerException().toString())
    }

    /**
     * 4
     */
    fun worWrongIni(){
        Log.e("CASE_NULL", "${variable2?.length}")
        variable2!!.length
    }

}