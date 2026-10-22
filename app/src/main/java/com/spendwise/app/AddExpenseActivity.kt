package com.spendwise.app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class AddExpenseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expense)

        val etAmount = findViewById<EditText>(R.id.etAmount)
        val tilAmount = findViewById<TextInputLayout>(R.id.tilAmount)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            val amountStr = etAmount.text.toString()
            if (amountStr.isEmpty()) {
                tilAmount.error = "Amount is required"
            } else {
                tilAmount.error = null
                Toast.makeText(this, "Expense saved (static data)", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}
