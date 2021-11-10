package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class QwenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qwen);
        WebView symbolInfo = (WebView) findViewById(R.id.qwenInfo);
        symbolInfo.setWebViewClient(new WebViewClient());
        symbolInfo.loadUrl("https://vedmak.fandom.com/wiki/%D0%97%D0%BD%D0%B0%D0%BA_%D0%9A%D0%B2%D0%B5%D0%BD");
    }
    public void back(View view){
        Intent intent = new Intent(QwenActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
