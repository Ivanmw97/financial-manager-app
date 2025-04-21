package com.ivandev.financialmanagerapp.shared.data.model

import java.time.LocalDateTime
import java.util.UUID

data class Budget(
    val id: UUID,
    val createdAt: LocalDateTime,
    val userId: UUID,
    val category: String,
    val budgetLimit: Double,
    val month: String
)
