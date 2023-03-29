package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
private Button add;
String msg1,msg2,msg3,msg4;
EditText name,phone,email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        add=findViewById(R.id.button5);
        name=findViewById(R.id.editTextTextPersonName2);
        phone=findViewById(R.id.editTextPhone);
        email=findViewById(R.id.editTextTextEmailAddress);
        pass=findViewById(R.id.editTextNumberPassword);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent details=new Intent(MainActivity2.this,MainActivity3.class);

            msg1=name.getText().toString();
                msg2=email.getText().toString();
                msg3=phone.getText().toString();
                msg4=pass.getText().toString();

            details.putExtra("v1",msg1);
            details.putExtra("v2",msg2);
            details.putExtra("v3",msg3);
            details.putExtra("v4",msg4);
                startActivity((details));
            }
        });
    }
}