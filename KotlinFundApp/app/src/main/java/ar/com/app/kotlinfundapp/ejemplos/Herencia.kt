package ar.com.app.kotlinfundapp.ejemplos

open class Herencia {
    public val prop1 = "Public y por defecto"
    private val prop2 = "Privada"
    protected val prop3 = "Protected"

    private fun algunMetodo(){
        val test = Herencia()
        test.prop1
    }
}

class ClassHija : Herencia(){
    private fun algunMetodo(){
        prop3
    }
}


class OtraClase(){
    private fun algunMetodo(){
        var test = Herencia()
        
    }
}

