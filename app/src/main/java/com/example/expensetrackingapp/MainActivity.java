package com.example.expensetrackingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String EXPENSE_ITEM = "com.example.android.expensetrackingapp.extra.EXPENSE_ITEM";

    ArrayList<ExpensePacked> expenseList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expenseList = new ArrayList<>();
    }

    public void addExpense(View view) {
        Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show();
        ExpensePacked newItem = new ExpensePacked();
        Intent intent = new Intent(this, ExpenseDetailsActivity.class);

        // Send an empty new item to get the new data


        startActivity(intent);

        // Update List
        RecyclerView inner_layout = findViewById(R.id.expense_list);

    }
}