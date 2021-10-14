package com.example.calculadorhipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnLimpiar: Button;
    private lateinit var btnCalcular: Button;
    private lateinit var etCatetoC: EditText;
    private lateinit var etCatetoB: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        etCatetoC = findViewById(R.id.tbCatetoC);
        etCatetoB = findViewById(R.id.tbCatetoB);

        btnLimpiar?.setOnClickListener {
            etCatetoC.setText("");
            etCatetoB.setText("");
        }
        btnCalcular?.setOnClickListener {
            if (!etCatetoC.text.toString().isEmpty() && !etCatetoB.text.toString().isEmpty()) {
                var catetoCCuadrado = Math.pow(etCatetoC.text.toString().toDouble(), 2.0)
                var catettoBCuadrado = Math.pow(etCatetoC.text.toString().toDouble(), 2.0)
                var hipotenusa = Math.sqrt(catetoCCuadrado + catettoBCuadrado)
                Toast.makeText(this, "La hipotenusa es: " + hipotenusa, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Uno o todos los campos se encuentran vacios, favor de proporcionarlos", Toast.LENGTH_LONG).show()
            }
        }
    }
}