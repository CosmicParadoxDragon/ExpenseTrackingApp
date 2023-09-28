package com.example.expensetrackingapp;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExpenseViewHolder extends RecyclerView.ViewHolder {
    public TextView title, desc, cost;
    public ExpenseViewHolder(@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title_in_list);
        desc = (TextView) itemView.findViewById(R.id.desc_in_list);
        cost = (TextView) itemView.findViewById(R.id.cost_in_list);
    }

    public void bindData(@NonNull final ExpensePacked expensePacked) {
        title.setText(expensePacked.getName());
        desc.setText(expensePacked.getDesc());
        cost.setText(expensePacked.getStringCost());
    }
}
