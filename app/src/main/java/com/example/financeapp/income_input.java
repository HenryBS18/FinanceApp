package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class income_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_input);

        //Declare
        EditText input_income;
        Button button_tambah2;

        //ID
        input_income = findViewById(R.id.input_income);
        button_tambah2 = findViewById(R.id.button_tambah);

        //button
        button_tambah2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Declare
                int hasil2 = 0, tambah2;

                //Get Text
                tambah2 = Integer.valueOf(input_income.getText().toString());

                //Rumus
                hasil2 = hasil2 + tambah2;

                //Intent
                Intent intent = new Intent(income_input.this, MainActivity.class);
                intent.putExtra("key_income", String.valueOf(hasil2));
                startActivity(intent);
            }
        });
    }
}