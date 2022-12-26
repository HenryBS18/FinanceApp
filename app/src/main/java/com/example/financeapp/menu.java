package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Declare
        Button button_back, button_expenses, button_income;

        //ID
        button_back = findViewById(R.id.button_back);
        button_expenses = findViewById(R.id.button_expenses);
        button_income = findViewById(R.id.button_income);

        //Button
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button_expenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, expenses_input.class);
                startActivity(intent);
            }
        });

        button_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, income_input.class);
                startActivity(intent);
            }
        });
    }
}