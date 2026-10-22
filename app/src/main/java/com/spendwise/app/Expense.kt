package com.spendwise.app

data class Expense(
    val id: Int,
    val amount: Double,
    val category: String,
    val date: String,
    val note: String
)
