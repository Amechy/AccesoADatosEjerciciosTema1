package com.example.amechy.accesoadatostema1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Alejandro Mechiné
 * @version 2.0
 * Esta clase maneja un piano pintado en pantalla.
 *
 */

public class Piano extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer mpDo,mpRe,mpReB,mpMi,mpMiB,mpFa,mpSol,mpSolB,mpLa,mpLaB,mpSi,mpSiB,mpDo2,mpRe2,mpRe2B;
    Button btnDo,btnRe,btnReB,btnMi,btnMiB,btnFa,btnSol,btnSolB,btnLa,btnLaB,btnSi,btnSiB,btnDo2,btnRe2,btnRe2B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);
        mpDo = MediaPlayer.create(this, R.raw.ado);
        mpReB = MediaPlayer.create(this, R.raw.reb);
        mpRe = MediaPlayer.create(this, R.raw.re);
        mpMiB = MediaPlayer.create(this, R.raw.mib);
        mpMi = MediaPlayer.create(this, R.raw.mi);
        mpFa = MediaPlayer.create(this, R.raw.fa);
        mpSolB = MediaPlayer.create(this, R.raw.solb);
        mpSol = MediaPlayer.create(this, R.raw.sol);
        mpLaB = MediaPlayer.create(this, R.raw.lab);
        mpLa = MediaPlayer.create(this, R.raw.la);
        mpSiB = MediaPlayer.create(this, R.raw.sib);
        mpSi = MediaPlayer.create(this, R.raw.si);
        mpDo2 = MediaPlayer.create(this, R.raw.do2);
        mpRe2B = MediaPlayer.create(this, R.raw.re2b);
        mpRe2 = MediaPlayer.create(this, R.raw.re2);




        btnDo = (Button)findViewById(R.id.btnDo);
        btnDo.setOnClickListener(this);
        btnReB = (Button)findViewById(R.id.btnReB);
        btnReB.setOnClickListener(this);
        btnRe = (Button)findViewById(R.id.btnRe);
        btnRe.setOnClickListener(this);
        btnMiB = (Button)findViewById(R.id.btnMiB);
        btnMiB.setOnClickListener(this);
        btnMi = (Button)findViewById(R.id.btnMi);
        btnMi.setOnClickListener(this);
        btnFa = (Button)findViewById(R.id.btnFa);
        btnFa.setOnClickListener(this);
        btnSolB = (Button)findViewById(R.id.btnSolB);
        btnSolB.setOnClickListener(this);
        btnSol = (Button)findViewById(R.id.btnSol);
        btnSol.setOnClickListener(this);
        btnLaB = (Button)findViewById(R.id.btnLaB);
        btnLaB.setOnClickListener(this);
        btnLa = (Button)findViewById(R.id.btnLa);
        btnLa.setOnClickListener(this);
        btnSiB = (Button)findViewById(R.id.btnSiB);
        btnSiB.setOnClickListener(this);
        btnSi = (Button)findViewById(R.id.btnSi);
        btnSi.setOnClickListener(this);
        btnDo2 = (Button)findViewById(R.id.btnDo2);
        btnDo2.setOnClickListener(this);
        btnRe2B = (Button)findViewById(R.id.btnRe2B);
        btnRe2B.setOnClickListener(this);
        btnRe2 = (Button)findViewById(R.id.btnRe2);
        btnRe2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnDo:
                mpDo.start();
                break;
            case R.id.btnReB:
                mpReB.start();
                break;
            case R.id.btnRe:
                mpRe.start();
                break;
            case R.id.btnMiB:
                mpMiB.start();
                break;
            case R.id.btnMi:
                mpMi.start();
                break;
            case R.id.btnFa:
                mpFa.start();
                break;
            case R.id.btnSolB:
                mpSolB.start();
                break;
            case R.id.btnSol:
                mpSol.start();
                break;
            case R.id.btnLaB:
                mpLaB.start();
                break;
            case R.id.btnLa:
                mpLa.start();
                break;
            case R.id.btnSiB:
                mpSiB.start();
                break;
            case R.id.btnSi:
                mpSi.start();
                break;
            case R.id.btnDo2:
                mpDo2.start();
                break;
            case R.id.btnRe2B:
                mpRe2B.start();
                break;
            case R.id.btnRe2:
                mpRe2.start();
                break;

        }
    }
}
