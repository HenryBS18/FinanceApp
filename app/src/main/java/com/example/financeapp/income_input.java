package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class income_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_input);

        //Declare
        EditText input_income;
        Button button_tambah;
        TextView text_saldo_rupiah;

        //ID
        input_income = findViewById(R.id.input_income);
        button_tambah = findViewById(R.id.button_tambah2);

        //button
        button_tambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Declare
                int hasil = 0, tambah;

                //Get Text
                tambah = Integer.valueOf(input_income.getText().toString());

                //Rumus
                hasil = hasil + tambah;

                //Intent
                Intent intent = new Intent(income_input.this, MainActivity.class);
                intent.putExtra("key_income", String.valueOf(hasil));
                startActivity(intent);
            }
        });
    }
}