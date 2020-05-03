package ar.com.app.cargarimagenes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /*variables val son inmutables no se puede modificar*/
    /*arreglo que almacena las imagenes a mostrar*/
    private val images = arrayOf(R.drawable.clint, R.drawable.asado, R.drawable.linux, R.drawable.java)
    private var imageOrder = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*primero el nombre de la variable despues el tipo
    * var view de tipo View*/
     fun changeImage(view: View){
        /*no tengo un incrementador como en java como ++ o --
        * si no que tengo funciones como inc*/
        imageOrder = imageOrder.inc()
        if (imageOrder == images.size){
            imageOrder = 0
        }

        setCurrentImage()
    }

    private fun setCurrentImage() {

        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setImageResource(images[imageOrder])
    }
}
