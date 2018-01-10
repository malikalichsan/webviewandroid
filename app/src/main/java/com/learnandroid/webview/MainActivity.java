package com.learnandroid.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webview );
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // webView.loadData("<html><p>This is <strong>webview</strong></p></html>", "text/html", "UTF-8");
        webView.loadUrl("https://stackoverflow.com/");
    }
}
