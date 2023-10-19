package com.example.befit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class BlogPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog_page)

        val mWebView : WebView = findViewById(R.id.WebView) as WebView
        mWebView.loadUrl("https://breakingmuscle.com/")

        val webSetting:WebSettings = mWebView.settings
        webSetting.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()
        mWebView.canGoBack()
        mWebView.setOnKeyListener(View.OnKeyListener{v,keycode, event ->
            if (keycode == KeyEvent.KEYCODE_BACK
                && event.action == MotionEvent.ACTION_UP
                && mWebView.canGoBack()){
                mWebView.goBack()
                return@OnKeyListener true
            }
            false

        })
    }
}