package com.example.amechy.accesoadatostema1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by amechy on 8/10/17.
 */

public class WebMostrada extends AppCompatActivity {

    WebView wbvWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_mostrada);

        wbvWeb = (WebView)findViewById(R.id.wbvWeb);
        wbvWeb.loadUrl(getIntent().getExtras().getString("webMostrada"));

    }
}
