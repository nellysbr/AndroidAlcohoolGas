package com.example.bestfuel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText inputAlcool, inputGasolina, inputPriceAlcool, inputPriceGasolina;
    private TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.textResult);
        inputAlcool = findViewById(R.id.inputAlcool);
        inputGasolina = findViewById(R.id.inputGasolina);
        inputPriceAlcool = findViewById(R.id.inputPriceAlcool);
        inputPriceGasolina = findViewById(R.id.inputPriceGasolina);


    }

    public void handleCalc(View view){



        double litroAlcool = Double.parseDouble(inputAlcool.getText().toString());
        double litroGasolina = Double.parseDouble(inputGasolina.getText().toString());
        double precoALcool = Double.parseDouble(inputPriceAlcool.getText().toString());
        double precoGasolina = Double.parseDouble(inputPriceGasolina.getText().toString());


        double razaoAlcoolGas = litroAlcool / litroGasolina;

        double totalGasolina = razaoAlcoolGas * precoGasolina;
        double totalAlcool = razaoAlcoolGas * precoALcool;

        if (totalGasolina > totalAlcool){
            textResult.setText("Álcool");
        }else {
            textResult.setText("Gasolina");
        }



    }
}
