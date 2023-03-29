package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
private Button search,back;
private EditText url;
public String myurl;
private WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        search=findViewById(R.id.button);
        url=findViewById(R.id.editTextTextPersonName);
        back=findViewById(R.id.button3);
        browser=findViewById(R.id.webview);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myurl=url.getText().toString();
                browser.loadUrl(myurl);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(HomeActivity.this, MainActivity.class);
                startActivity(back);

            }
        });
    }
}