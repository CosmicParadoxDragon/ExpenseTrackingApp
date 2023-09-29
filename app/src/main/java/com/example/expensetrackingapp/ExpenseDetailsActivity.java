package com.example.expensetrackingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExpenseDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expense_details_activity);
        Button done_buttton = (Button) findViewById(R.id.done_button);
        done_buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ExpenseDetailsActivity.this, "Done Button Presses", Toast.LENGTH_SHORT).show();
            }
        });

    }
}