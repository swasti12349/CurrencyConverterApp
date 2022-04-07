package com.sro.currenyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button convertb;
TextView rupee;
EditText dollar;
String dollars;
int rupees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertb = findViewById(R.id.convert);
        rupee = (TextView) findViewById(R.id.rupeet);
        dollar = findViewById(R.id.dollar);


        convertb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dollars = dollar.getText().toString();
                rupees = Integer.parseInt(dollars);
                rupees = rupees * 76;
                rupee.setText(rupees);
            }
        });


    }
}