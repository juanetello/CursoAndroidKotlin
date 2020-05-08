package ar.com.app.kotlinfundapp.ejemplos

import android.util.Log

/**
 * En kotlin todo es un objeto
 * No hay tipos basicos y no existe VOID
 * tenemos variables mutables (var) y variables inmutables (val)
 */

class Variables {

    //INT
    private var variableUno = 1
    private var variableDos = 1.toByte()
    private var variableTres = -777

    //LONG
    /*private var varLongUno = 12345678910111*/
    /*private var varLongUno = 122L*/

    //FLOAT
    private var varFloatUno = 23.5.toFloat()
    private var varFloatDos = 23.5f

    //CHAR
    private var varChar = 'A'

    //STRING
    private var varString = "A"

    //BOOLEAN
    private var varBoolean = true


    fun workInteger(){
        var integer : Int
        integer = 10

        Log.i("INTEGER", "variableUno es un integer? " + (variableUno is Int))

        Log.i("INTEGER", "variableDos es un byte? " + (variableDos is Byte))

        /*Log.i("INTEGER", "varFloatUno es un float? " + (varFloatUno is Float))*/
    }
    
    fun workFloat(){
        Log.i("FLOAT", "La variable varFloatUno es un float? " + (varFloatUno is Float))
    }

    /*Para trabajar con los STRING*/
    fun workString(){
        Log.i("CASE_STRING", "La variable varString tiene un string??? " + (varString is String))

        //En JAVA hariamos algo asi
        var varStringJava = "Hola salto de linea \n que andes bien"

        //En Kotlin

        var varStringKotlin = """Hola
            |salto de linea o algo asi 
        """.trimMargin()

        Log.i("CASE_STRING", "Estilo JAVA: $varStringJava")
        Log.i("CASE_STRING", "Estilo KOTLIN: $varStringKotlin")

        var nota = 41
        var maxNota = 100

        varStringKotlin = "Mi nota fue $nota/$maxNota"
        Log.i("CASE_STRING", varStringKotlin)
        varStringKotlin = "Multiplico la nota ${nota * 1.5}"
        Log.i("CASE_STRING", varStringKotlin)
        
    }
    
    fun workBoolean(){
        Log.i("BOOLEANJET", "La variable varBoolean es de tipo boolean??" + (varBoolean is Boolean))
    }
    
    fun workArray(){
        var varArray = arrayOf(1,2,3,45)
        
        //Arrays con nulos es necesario pasarle un tamaño
        var varArrayNulls = arrayOfNulls<Int>(3)
        varArrayNulls = arrayOf(7,8,9,33,3,311,36,2,3)
        
        varArrayNulls[0]?.toFloat() //safe call en caso de ser nulo devuelve nulo
        varArrayNulls[0]?.toFloat()?:"Error" // Operador Elvis --> En caso de ser nulo devuelve ERROR
        varArrayNulls[0]!!.toFloat() // Si el valor es nulo va a lanzar un NULL POINTER EXCEPTION
        
        Log.i("ARRAYS", "holaaa")
    }

}
