package com.ivandev.financialmanagerapp.shared.data.model

import java.time.LocalDateTime
import java.util.UUID

data class Transaction(
    val id: UUID,
    val createdAt: LocalDateTime,
    val userId: UUID,
    val amount: Double,
    val date: LocalDateTime,
    val description: String,
    val category: String,
    val type: TransactionType
)

enum class TransactionType {
    INCOME,
    EXPENSE
}
