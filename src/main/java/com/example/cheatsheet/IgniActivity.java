package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IgniActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igni);
        WebView symbolInfo = (WebView) findViewById(R.id.igniInfo);
        symbolInfo.setWebViewClient(new WebViewClient());
        symbolInfo.loadUrl("https://vedmak.fandom.com/wiki/%D0%97%D0%BD%D0%B0%D0%BA_%D0%98%D0%B3%D0%BD%D0%B8");
    }
    public void back(View view){
        Intent intent = new Intent(IgniActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
