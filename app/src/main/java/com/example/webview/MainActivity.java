package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wV;
    EditText eT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV= findViewById(R.id.wV);
        eT = findViewById(R.id.eT);
        wV.getSettings().setJavaScriptEnabled(true);



    }

    public void go(View view) {
        wV.setWebViewClient(new MyWebViewClient());
//
        String stringUrl=eT.getText().toString();
        wV.loadUrl(stringUrl);

    }
}