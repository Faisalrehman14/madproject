package com.spendwise.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val recentExpenses = listOf(
        Expense(1, 15.50, "Food", "2026-10-21", "Lunch"),
        Expense(2, 5.00, "Transport", "2026-10-21", "Bus fare"),
        Expense(3, 20.00, "Study", "2026-10-20", "Book")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvTotalBalance).text = "Total Balance: $140.00"

        val rv = findViewById<RecyclerView>(R.id.rvRecentExpenses)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = ExpenseAdapter(recentExpenses) { expense ->
            val intent = Intent(this, ExpenseDetailActivity::class.java)
            // In a real app, we'd pass the expense ID or object
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnAddExpense).setOnClickListener {
            startActivity(Intent(this, AddExpenseActivity::class.java))
        }

        findViewById<Button>(R.id.btnViewList).setOnClickListener {
            startActivity(Intent(this, ExpenseListActivity::class.java))
        }

        findViewById<Button>(R.id.btnViewSummary).setOnClickListener {
            startActivity(Intent(this, SummaryActivity::class.java))
        }
    }
}
