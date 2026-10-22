package com.example.spendwise

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ExpenseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_detail)

        findViewById<Button>(R.id.btnEdit).setOnClickListener {
            Toast.makeText(this, "Edit clicked", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnDelete).setOnClickListener {
            Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
