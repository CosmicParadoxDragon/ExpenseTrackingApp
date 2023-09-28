package com.example.expensetrackingapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AA_RecyclerAdapter extends RecyclerView.Adapter {
    private List<ExpensePacked> models = new ArrayList<>();
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ExpenseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        ((ExpenseViewHolder) holder).bindData(models.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
