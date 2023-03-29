package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
TextView t1,t2,t3,t4;
    String msg1,msg2,msg3,msg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        t1=findViewById(R.id.name);
        t2=findViewById(R.id.email);
        t3=findViewById(R.id.phone);
        t4=findViewById(R.id.pass);
        Intent intent=getIntent();
        msg1=intent.getStringExtra("v1");
        msg2=intent.getStringExtra("v2");
        msg3=intent.getStringExtra("v3");
        msg4=intent.getStringExtra("v4");
        System.out.println(msg1);


        t1.setText( t1.getText().toString()+msg1);
        t2.setText(t2.getText().toString()+msg2);
        t3.setText(t3.getText().toString()+msg3);
        t4.setText(t4.getText().toString()+msg4);

    }
}