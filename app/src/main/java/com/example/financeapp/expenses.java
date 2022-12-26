package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class expenses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);

        //Declare
        Button button_home, button_expenses, button_income, button_setting;

        //ID
        button_home = findViewById(R.id.button_home);
        button_expenses = findViewById(R.id.button_expenses);
        button_income = findViewById(R.id.button_income);
        button_setting = findViewById(R.id.button_setting);

        //Button
        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(expenses.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button_expenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(expenses.this, expenses.class);
                startActivity(intent);
            }
        });

        button_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(expenses.this, income.class);
                startActivity(intent);
            }
        });

        button_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(expenses.this, setting.class);
                startActivity(intent);
            }
        });
    }
}