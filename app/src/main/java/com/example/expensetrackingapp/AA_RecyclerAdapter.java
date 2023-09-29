package com.example.expensetrackingapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AA_RecyclerAdapter extends RecyclerView.Adapter<AA_RecyclerAdapter.ExpenseViewHolder> {
    ArrayList<ExpensePacked> list;
    Context mContext;
    public AA_RecyclerAdapter(Context context, ArrayList<ExpensePacked> dataSet) {
        mContext = context;
        list = dataSet;
    }
    @NonNull
    @Override
    public AA_RecyclerAdapter.ExpenseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expense_list_item, parent, false);
        return new ExpenseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AA_RecyclerAdapter.ExpenseViewHolder holder, int position) {
        holder.title.setText((String) list.get(position).getName());
        holder.desc.setText((String) list.get(position).getDesc());
        holder.cost.setText((String) list.get(position).getStringCost());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class ExpenseViewHolder extends RecyclerView.ViewHolder {
        TextView title, desc, cost;
        public ExpenseViewHolder(@NonNull View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title_in_list);
            desc = (TextView) view.findViewById(R.id.desc_in_list);
            cost = (TextView) view.findViewById(R.id.cost_in_list);
        }

//        public void bindData(@NonNull final ExpensePacked expensePacked) {
//            title.setText(expensePacked.getName());
//            desc.setText(expensePacked.getDesc());
//            cost.setText(expensePacked.getStringCost());
//        }
    }
}
