package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button1,button2;
public String email;
    public String password;
private EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        button1=findViewById(R.id.button1);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email= et1.getText().toString();
                password= et2.getText().toString();
                if(email.equals("aliaqsam216@gmail.com")&&password.equals("12345")){
                    Toast.makeText(getApplicationContext(),"Log In Successful",Toast.LENGTH_LONG).show();
                    Intent ihome=new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(ihome);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}