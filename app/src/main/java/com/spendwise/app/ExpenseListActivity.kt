package com.spendwise.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ExpenseListActivity : AppCompatActivity() {

    private val allExpenses = listOf(
        Expense(1, 15.50, "Food", "2026-10-21", "Lunch"),
        Expense(2, 5.00, "Transport", "2026-10-21", "Bus fare"),
        Expense(3, 20.00, "Study", "2026-10-20", "Book"),
        Expense(4, 50.00, "Shopping", "2026-10-19", "Clothes"),
        Expense(5, 12.00, "Food", "2026-10-18", "Dinner")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_list)

        val rv = findViewById<RecyclerView>(R.id.rvExpenses)
        val tvEmpty = findViewById<TextView>(R.id.tvEmptyMessage)

        if (allExpenses.isEmpty()) {
            tvEmpty.visibility = View.VISIBLE
            rv.visibility = View.GONE
        } else {
            tvEmpty.visibility = View.GONE
            rv.visibility = View.VISIBLE
            rv.layoutManager = LinearLayoutManager(this)
            rv.adapter = ExpenseAdapter(allExpenses) {
                startActivity(Intent(this, ExpenseDetailActivity::class.java))
            }
        }
    }
}
