package com.example.funcion_sum_res_mul_div;

public class Calculadora {
    private double resultado;

    public Calculadora() {
        resultado = 0;
    }

    public double getResultado() {
        return resultado;
    }

    public void suma(double num1, double num2) {
        resultado = num1 + num2;
    }

    public void resta(double num1, double num2) {
        resultado = num1 - num2;
    }

    public void multiplicacion(double num1, double num2) {
        resultado = num1 * num2;
    }

    public void division(double num1, double num2) {
        if (num2 != 0) {
            resultado = num1 / num2;
        }
    }
}
