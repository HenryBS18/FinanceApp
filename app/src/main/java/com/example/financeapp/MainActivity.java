package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare
        Button button_add, button_home, button_expenses, button_income, button_setting;
        TextView text_saldo_rupiah, text_penghasilan_rupiah, text_pengeluaran_rupiah;

        //ID
        button_add = findViewById(R.id.button_add);
        button_home = findViewById(R.id.button_home);
        button_expenses = findViewById(R.id.button_expenses);
        button_income = findViewById(R.id.button_income);
        button_setting = findViewById(R.id.button_setting);

        text_saldo_rupiah = findViewById(R.id.text_saldo_rupiah);
        text_penghasilan_rupiah = findViewById(R.id.text_penghasilan_rupiah);
        text_pengeluaran_rupiah = findViewById(R.id.text_pengeluaran_rupiah);

        //Button
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu.class);
                startActivity(intent);
            }
        });

        button_expenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, expenses.class);
                startActivity(intent);
            }
        });

        button_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, income.class);
                startActivity(intent);
            }
        });

        button_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, setting.class);
                startActivity(intent);
            }
        });

        //Intent
        Intent intent = getIntent();
        String expenses = intent.getExtras().getString("key_expenses");
        String income = intent.getExtras().getString("key_income");

        //Pengeluaran
        if (expenses != null) {
            text_pengeluaran_rupiah.setText("Rp. " + expenses);
        }

        //Penghasilan
        if (income != null) {
            text_penghasilan_rupiah.setText("Rp. " + income);
        }
    }
}