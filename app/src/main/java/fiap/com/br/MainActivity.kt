package fiap.com.br
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButtonAndroid = findViewById<Button>(R.id.bttn_android)
        val myButtonIOS= findViewById<Button>(R.id.bttn_ios)
        val myTextViewResultado = findViewById<TextView>(R.id.resultado)

        myButtonAndroid.setOnClickListener {

            myTextViewResultado.text = "Você prefere Android!"
        }
        myButtonIOS.setOnClickListener {
            myTextViewResultado.text = "Você prefere IOS!"
        }

    }






}