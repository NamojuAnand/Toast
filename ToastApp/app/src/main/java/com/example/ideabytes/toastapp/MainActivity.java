package com.example.ideabytes.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add();

    }
    public void add(){
        editText1=findViewById(R.id.edit1);
        editText2=findViewById(R.id.edit2);
        button1=findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=editText1.getText().toString();
                String value2=editText2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                Toast.makeText(getApplicationContext(),"value"+String.valueOf(sum),Toast.LENGTH_SHORT).show();
                //Toast toast=Toast.makeText(getApplicationContext(),"Hello Android",Toast.LENGTH_LONG);
                //toast.setMargin(50,50);
                //toast.show();
            }
        });
    }
}
