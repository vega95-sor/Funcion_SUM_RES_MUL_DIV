package com.example.funcion_sum_res_mul_div;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNum1, editTextNum2;
    private Button buttonSuma, buttonResta, buttonMultiplicacion, buttonDivision;
    private Calculadora calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        buttonSuma = findViewById(R.id.buttonSuma);
        buttonResta = findViewById(R.id.buttonResta);
        buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        buttonDivision = findViewById(R.id.buttonDivision);

        calculadora = new Calculadora();

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validarEntrada()) {
                    double num1 = Double.parseDouble(editTextNum1.getText().toString());
                    double num2 = Double.parseDouble(editTextNum2.getText().toString());
                    calculadora.suma(num1, num2);
                    abrirSegundaPantalla();
                }
            }
        });

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validarEntrada()) {
                    double num1 = Double.parseDouble(editTextNum1.getText().toString());
                    double num2 = Double.parseDouble(editTextNum2.getText().toString());
                    calculadora.resta(num1, num2);
                    abrirSegundaPantalla();
                }
            }
        });

        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validarEntrada()) {
                    double num1 = Double.parseDouble(editTextNum1.getText().toString());
                    double num2 = Double.parseDouble(editTextNum2.getText().toString());
                    calculadora.multiplicacion(num1, num2);
                    abrirSegundaPantalla();
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validarEntrada()) {
                    double num1 = Double.parseDouble(editTextNum1.getText().toString());
                    double num2 = Double.parseDouble(editTextNum2.getText().toString());
                    calculadora.division(num1, num2);
                    abrirSegundaPantalla();
                }
            }
        });
    }

    private boolean validarEntrada() {
        if (TextUtils.isEmpty(editTextNum1.getText()) || TextUtils.isEmpty(editTextNum2.getText())) {
            Toast.makeText(this, "Ingresa ambos números", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!esNumeroValido(editTextNum1.getText().toString()) || !esNumeroValido(editTextNum2.getText().toString())) {
            Toast.makeText(this, "Ingresa números válidos", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private boolean esNumeroValido(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void abrirSegundaPantalla() {
        Intent intent = new Intent(MainActivity.this, Segunda_Actividad.class);
        intent.putExtra("resultado", calculadora.getResultado());
        startActivity(intent);
    }
}
