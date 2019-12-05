package gomez.roberto.loginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = etNombre.text.toString()
        val pass =etPass.text.toString()

        if(user.equals("") or pass.equals("")) {

        }

             fun onStart() {
                super.onStart()
                 Log.w("ejemle","Debo estar en el onStart")
            }
        }
        fun mensaje(mensaje:String,dur:Int=Toast.LENGTH_SHORT){
            Toast.makeText(this,mensaje,dur).show()
        }
    }

