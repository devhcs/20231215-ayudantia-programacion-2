package cl.stgoneira.android.a20231215_ayudantia_programacion_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import cl.stgoneira.android.a20231215_ayudantia_programacion_2.modelo.Promedio

class MainActivity : AppCompatActivity() {

    var btnPromedio:Button? = null
    var etNota1:EditText? = null
    var etNota2:EditText? = null
    var etNota3:EditText? = null
    var tvPromedio:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNota1 = findViewById<EditText>(R.id.etNota1)
        etNota2 = findViewById<EditText>(R.id.etNota2)
        etNota3 = findViewById<EditText>(R.id.etNota3)

        tvPromedio = findViewById<TextView>(R.id.tvPromedio)

        btnPromedio = findViewById<Button>(R.id.btnPromedio)

        btnPromedio?.setOnClickListener {
            Log.v("MainActivity", "btnPromedio::onClick")

            val nota1Str = etNota1?.text.toString()
            val nota2Str = etNota2?.text.toString()
            val nota3Str = etNota3?.text.toString()

            val nota1 = nota1Str.toFloatOrNull() ?: 1.0f
            val nota2 = nota2Str.toFloatOrNull() ?: 1.0f
            val nota3 = nota3Str.toFloatOrNull() ?: 1.0f

            val objPromedio = Promedio()
            objPromedio.agregarNota(nota1)
            objPromedio.agregarNota(nota2)
            objPromedio.agregarNota(nota3)
            val promedio = objPromedio.calcularPromedio()

            tvPromedio?.setText(promedio.toString())

        }
    }


}