package com.example.cheatsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class AarlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aarl);
        WebView symbolInfo = (WebView) findViewById(R.id.aarlInfo);
        symbolInfo.setWebViewClient(new WebViewClient());
        symbolInfo.loadUrl("https://vedmak.fandom.com/wiki/%D0%97%D0%BD%D0%B0%D0%BA_%D0%90%D0%B0%D1%80%D0%B4");
    }
    public void back(View view){
        Intent intent = new Intent(AarlActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
