package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class expenses_input extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses_input);

        //Declare
        Button button_tambah;
        EditText input_expenses;

        //ID
        button_tambah = findViewById(R.id.button_tambah);
        input_expenses = findViewById(R.id.input_expenses);

        //button
        button_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Declare
                int hasil = 0, tambah;

                //Get Text
                tambah = Integer.valueOf(input_expenses.getText().toString());

                //Rumus
                hasil = hasil - tambah;

                //Intent
                Intent intent = new Intent(expenses_input.this, MainActivity.class);
                intent.putExtra("key_expenses", String.valueOf(hasil));
                startActivity(intent);
            }
        });
    }
}