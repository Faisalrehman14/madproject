package com.example.spendwise

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter(
    private val expenses: List<Expense>,
    private val onItemClick: (Expense) -> Unit
) : RecyclerView.Adapter<ExpenseAdapter.ExpenseViewHolder>() {

    class ExpenseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvCategory: TextView = view.findViewById(R.id.tvItemCategory)
        val tvDate: TextView = view.findViewById(R.id.tvItemDate)
        val tvAmount: TextView = view.findViewById(R.id.tvItemAmount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_expense, parent, false)
        return ExpenseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val expense = expenses[position]
        holder.tvCategory.text = expense.category
        holder.tvDate.text = expense.date
        holder.tvAmount.text = "$${String.format("%.2f", expense.amount)}"
        
        holder.itemView.setOnClickListener { onItemClick(expense) }
    }

    override fun getItemCount() = expenses.size
}
