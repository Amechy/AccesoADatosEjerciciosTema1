package com.example.amechy.accesoadatostema1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/**
 * @author Alejandro Mechine
 * Esta clase cambia el valor de euros a dolares y viceversa. Funcionalidad añadida de definir el cambio de dolares a euros y videversa.
 */
public class Divisas extends AppCompatActivity implements View.OnClickListener {


        double Euro = 0d;
        double Dolar = 0d;
        double valorDivisa = 1.18d;
        Button convertirDivisa;
        EditText etxEuro;
        EditText etxDolar;
        EditText etxCambioActual;
        RadioButton rbtnDolar;
        RadioButton rbtnEuro;
        RadioGroup rgpConversor;
        String resultado;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_divisas);
            convertirDivisa = (Button) findViewById(R.id.btnConvertir);
            etxEuro = (EditText) findViewById(R.id.etxEuro);
            etxDolar = (EditText) findViewById(R.id.etxDolar);
            etxCambioActual = (EditText)findViewById(R.id.etxCambioActual);
            rbtnDolar = (RadioButton) findViewById(R.id.rbtnDolar);
            rbtnEuro = (RadioButton) findViewById(R.id.rbtnEuro);
            rgpConversor = (RadioGroup) findViewById(R.id.rgpConversor);
            etxDolar.setText("0");
            etxEuro.setText("0");
            etxCambioActual.setText("1.18");
            rgpConversor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                    if (rbtnDolar.isChecked()) {
                        etxDolar.setEnabled(true);
                        etxEuro.setEnabled(false);
                        etxDolar.setText("0");
                        etxEuro.setText("0");
                    }
                    else {
                        etxDolar.setEnabled(false);
                        etxEuro.setEnabled(true);
                        etxDolar.setText("0");
                        etxEuro.setText("0");
                    }
                }
            });
        }

        @Override
        public void onClick(View view) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(etxCambioActual.getWindowToken(), 0);
            if (etxCambioActual.getText().toString().length() > 0 && Double.parseDouble(etxCambioActual.getText().toString())> 0){
                valorDivisa = Double.parseDouble(etxCambioActual.getText().toString());
            }
            else {
                try {
                    throw new Exception("Valor de cambio de divisas invalido");
                } catch (Exception e) {

                    Snackbar.make(view, e.getMessage(),Snackbar.LENGTH_LONG).show();

                }

            }
            if (rbtnDolar.isChecked()) {
                if (etxDolar.getText().length() > 0) {
                    try {
                        Dolar = Double.parseDouble(etxDolar.getText().toString());
                        Euro = Double.parseDouble(etxEuro.getText().toString());
                        resultado = String.valueOf(Math.round(Dolar / valorDivisa *100d)/100d);
                        etxEuro.setText(resultado);
                    }
                    catch (Exception e)
                    {
                        Snackbar.make(view, "Número inválido",Snackbar.LENGTH_LONG).show();
                    }

                } else {
                    etxDolar.setText("1");
                    etxEuro.setText("0.85");
                }
            } else {
                if (rbtnEuro.isChecked()) {
                    etxDolar.setEnabled(false);
                    if (etxEuro.getText().length() > 0) {
                        try {
                            Euro = Double.parseDouble(etxEuro.getText().toString());
                            Dolar = Double.parseDouble(etxDolar.getText().toString());
                            resultado = String.valueOf(Math.round(Euro * valorDivisa * 100d) / 100d);
                            etxDolar.setText(resultado);
                        }
                        catch (Exception e) {
                            Snackbar.make(view, "Número inválido",Snackbar.LENGTH_LONG).show();
                        }
                    }
                    else {
                        etxEuro.setText("1");
                        etxDolar.setText("1.18");

                    }
                }
            }
        }
    }
