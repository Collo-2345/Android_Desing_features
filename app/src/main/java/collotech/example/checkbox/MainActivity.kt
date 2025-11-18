package collotech.example.checkbox

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Switch
import android.widget.Toast
import android.widget.Spinner
import android.widget.ListView
import android.widget.ProgressBar
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val swich_btn = findViewById<Switch>(R.id.switchtoggle)

        val Spinnerr = findViewById<Spinner>(R.id.spinner)

        val listview = findViewById<ListView>(R.id.listview)


        // Display items in a spinner
        val countries = arrayOf("Kenya","Tanzania","USA","Cameroon","Nigeria","Ghana","South Africa")

        Spinnerr.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, countries)


        // Display items in a listview

        val food  = arrayOf("Mango","PineApple","Lemmon","Pawpaw","Apple","Orange","Banana","Guava","Watermelon","Strawberry")
        listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, food)

        // progress bar backend
        val progressbar = findViewById<ProgressBar>(R.id.progressbar)
        progressbar.visibility = View.VISIBLE

        Handler(Looper.getMainLooper()).postDelayed({
            progressbar.visibility = View.GONE
        }, 5000) // 5 seconds


        swich_btn.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                Toast.makeText(this, "Wifi is ON", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Wifi is OFF", Toast.LENGTH_SHORT).show()
        }





    }
}

