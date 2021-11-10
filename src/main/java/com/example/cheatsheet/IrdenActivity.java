package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IrdenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irden);
        WebView symbolInfo = (WebView) findViewById(R.id.irdenInfo);
        symbolInfo.setWebViewClient(new WebViewClient());
        symbolInfo.loadUrl("https://vedmak.fandom.com/wiki/%D0%97%D0%BD%D0%B0%D0%BA_%D0%98%D1%80%D0%B4%D0%B5%D0%BD");
    }
    public void back(View view){
        Intent intent = new Intent(IrdenActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
