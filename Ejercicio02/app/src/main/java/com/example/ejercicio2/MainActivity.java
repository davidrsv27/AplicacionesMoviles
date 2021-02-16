package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1,num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.etNumero1);
        num2 = (EditText) findViewById(R.id.etNumero2);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }


    public void Suma(View View) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 =  Integer.parseInt(num2.getText().toString());
        float suma = n1+n2;
        resultado.setText("El resultado de suma es: "+suma);
    }
    public void Resta(View View) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 =  Integer.parseInt(num2.getText().toString());
        float resta = n1-n2;
        resultado.setText("El resultado de la resta es: "+resta);
    }
    public void Divi(View View) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 =  Integer.parseInt(num2.getText().toString());
        if (n2==0){
            resultado.setText("No se puede dividir por 0");
        }else {
            float Divi = n1 / n2;
            resultado.setText("El resultado de la division es: " + Divi);
        }
    }
    public void Multi(View View) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 =  Integer.parseInt(num2.getText().toString());
        float Multi = n1*n2;
        resultado.setText("El resultado de la multiplicaión es: "+Multi);
    }

}