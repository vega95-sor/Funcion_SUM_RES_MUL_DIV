package com.example.funcion_sum_res_mul_div;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Segunda_Actividad extends AppCompatActivity {
 private TextView textViewResultado;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.actividad_segunda);

  textViewResultado = findViewById(R.id.textViewResultado);

  double resultado = getIntent().getDoubleExtra("resultado", 0);
  textViewResultado.setText("Resultado: " + resultado);
 }
}


