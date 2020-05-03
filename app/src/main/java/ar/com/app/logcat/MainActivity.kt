package ar.com.app.logcat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener{mostrarMensaje()}

    }
    /*Kotlin palabra reservada para funcion en 'fun' luego el nombre de la funcion*/
    private fun mostrarMensaje(){
        /*
        * El LOG CAT por lo gral agarra todos los errores,
        * agregamos los logs con i es para INFORMACION por ejemplo
        * agregamos un TAG para poder reconocer el error
        * para traer el id no hago un findbyId si no con un ${} */
        Log.i("MainACTIVITY", "Login es: ${editTextLogin.text}, y la pass es: ${editText2.text}")

    }
}
