package com.example.ejercicio003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numA,numB,numC;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numA = (EditText) findViewById(R.id.etValorA);
        numB = (EditText) findViewById(R.id.etValorB);
        numC = (EditText) findViewById(R.id.etValorC);
        respuesta = (TextView) findViewById(R.id.tvResultado);
    }

    public void Resultado(View View){
        double numa = Double.parseDouble(numA.getText().toString());
        double numb = Double.parseDouble(numB.getText().toString());
        double numc = Double.parseDouble(numC.getText().toString());
        double discriminante = ((numb*numb)-((4)*(numa)*(numc)));
        if(discriminante < 0){
            respuesta.setText("La ecucacipon no tiene soluciones reales");
        }else if (discriminante == 0){
            double x = -numb/((2)*(numa));
            respuesta.setText("La solucion unica es: " +x);
        }else{
            double x1 = (-numb + Math.sqrt(discriminante)) / 2*numa;
            double x2 = (-numb - Math.sqrt(discriminante)) / 2*numa;
            respuesta.setText("Las dos soluciones son: X1" +x1+ " X2 "+x2);
        }

    }
}