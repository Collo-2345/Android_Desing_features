package collotech.example.checkbox

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.google.android.material.slider.Slider

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)



        val slider = findViewById<Slider>(R.id.slider)

        val navigation = findViewById<ImageView>(R.id.arrowback)


        // Slider is the modern design of seekbar
        slider.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {
                // User starts sliding (optional)
            }

            override fun onStopTrackingTouch(slider: Slider) {
                Toast.makeText(this@MainActivity2, "Final value: ${slider.value.toInt()}", Toast.LENGTH_SHORT).show()
            }
        })


        navigation.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}