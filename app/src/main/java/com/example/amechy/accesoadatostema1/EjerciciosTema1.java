package com.example.amechy.accesoadatostema1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;

public class EjerciciosTema1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios_tema1);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnEjercicio1:
                startActivity(new Intent(this,Divisas.class));
                break;
            case R.id.btnEjercicio2:
                startActivity(new Intent(this,MostrarWeb.class));
                break;
            case R.id.btnEjercicio3:
                startActivity(new Intent(this,ContadorDeCafe.class));
                break;
            case R.id.btnEjercicio4:
                startActivity(new Intent(this,Piano.class));
                break;


        }
    }
}
