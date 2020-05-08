package ar.com.app.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum (view : View){
        val  value1 = editText.text.toString().toDouble()
        val  value2 = editText2.text.toString().toDouble()
        textViewResultado.text = "Resultado: ${value1 + value2}"
    }

    fun sub (view : View){
        val  value1 = editText.text.toString().toDouble()
        val  value2 = editText2.text.toString().toDouble()
        textViewResultado.text = "Resultado: ${value1 - value2}"
    }

    fun multi (view: View){
        val  value1 = editText.text.toString().toDouble()
        val  value2 = editText2.text.toString().toDouble()
        textViewResultado.text = "Resultado: ${value1 * value2}"
    }

    fun div (view: View){
        val  value1 = editText.text.toString().toDouble()
        val  value2 = editText2.text.toString().toDouble()
        textViewResultado.text = "Resultado: ${value1 / value2}"
    }
}
