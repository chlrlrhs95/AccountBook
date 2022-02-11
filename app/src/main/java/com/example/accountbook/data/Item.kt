package com.example.accountbook.data

enum class ItemType {
    INCOME, EXPENDITURE,
}

data class Item(
    val type: ItemType,
    val time: Long,
    val value: Long,
    val name: String,
    val image: Int? = null,
)
