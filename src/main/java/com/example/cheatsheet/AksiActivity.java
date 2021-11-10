package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AksiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksi);
        WebView symbolInfo = (WebView) findViewById(R.id.aksiInfo);
        symbolInfo.setWebViewClient(new WebViewClient());
        symbolInfo.loadUrl("https://vedmak.fandom.com/wiki/%D0%97%D0%BD%D0%B0%D0%BA_%D0%90%D0%BA%D1%81%D0%B8%D0%B9");
    }
    public void back(View view){
        Intent intent = new Intent(AksiActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
