package ar.com.app.kotlinfundapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ar.com.app.kotlinfundapp.ejemplos.ControlFlujo
import ar.com.app.kotlinfundapp.ejemplos.NullAble
import ar.com.app.kotlinfundapp.ejemplos.Operadores
import ar.com.app.kotlinfundapp.ejemplos.Variables

class MainActivity : AppCompatActivity() {

    /*Con el onCreate vamos a lanzar el activity*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Integer
        Variables().workInteger()
        //Float
        Variables().workFloat()
        //String
        Variables().workString()
        //Boolean
        Variables().workBoolean()

        //Control Flujo
        ControlFlujo().workExpression()
        ControlFlujo().workWhen()

        Operadores().workEquals()
        Operadores().workEqualsDataClass()
        
        NullAble().workOnlySafe(null)
        NullAble().workNullPointerException()
        
        
    }
}
