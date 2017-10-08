package com.example.amechy.accesoadatostema1;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ContadorDeCafe extends AppCompatActivity implements View.OnClickListener{
    TextView txvNCafes, txvTemporizador;
    Button btnMenos, btnMas, btnComenzar;
    int nCafes;
    MediaPlayer aviso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_de_cafe);

        txvNCafes = (TextView) findViewById(R.id.txvNCafes);
        txvTemporizador = (TextView) findViewById(R.id.txvTemporizador);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnMas = (Button) findViewById(R.id.btnMas);
        btnComenzar = (Button) findViewById(R.id.btnComenzar);
        btnMas.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnComenzar.setOnClickListener(this);
        nCafes = 0;


        aviso = MediaPlayer.create(this, R.raw.audio);


    }

    @Override
    public void onClick(View view) {
        int minutos = Integer.parseInt(txvTemporizador.getText().toString().substring(0,1));

        switch (view.getId())
        {

            case R.id.btnComenzar:

                btnComenzar.setEnabled(false);
                btnMenos.setEnabled(false);
                btnMas.setEnabled(false);

                MyCountDownTimer contador = new MyCountDownTimer(minutos *60*1000,1000);
                contador.start();
                break;
            case R.id.btnMas:
                if (minutos < 9)
                {
                    txvTemporizador.setText((Integer.parseInt(txvTemporizador.getText().toString().substring(0,1))+1)+":00");

                }
                else
                {
                    btnMas.setEnabled(false);
                    btnMenos.setEnabled(true);
                }
                break;
            case R.id.btnMenos:
                if (minutos > 1)
                {
                    txvTemporizador.setText((Integer.parseInt(txvTemporizador.getText().toString().substring(0,1))-1)+":00");

                }
                else
                {

                    btnMenos.setEnabled(false);
                    btnMas.setEnabled(true);
                }
                break;
        }
    }

    public class MyCountDownTimer  extends CountDownTimer {

        long _minutos;
       long _segundos;

        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);

        }



        @Override
        public void onTick(long l) {
            _minutos = (l/1000)/60;
            _segundos = (l/1000)%60;

            if (_segundos < 10)
            {
                txvTemporizador.setText(_minutos + ":0" + _segundos);
            }
            else
            {
                txvTemporizador.setText(_minutos + ":" + _segundos);
            }
        }

        @Override
        public void onFinish() {
            btnComenzar.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMas.setEnabled(true);
            txvTemporizador.setText("5:00");
            nCafes ++;
            txvNCafes.setText(Integer.toString(nCafes));
            aviso.start();
        }
    }
}


