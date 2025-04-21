package com.ivandev.financialmanagerapp.shared.data.local.transaction

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ivandev.financialmanagerapp.shared.data.model.TransactionType
import java.time.LocalDateTime
import java.util.UUID

@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey val id: UUID,
    val createdAt: LocalDateTime,
    val userId: UUID,
    val amount: Double,
    val date: LocalDateTime,
    val description: String,
    val category: String,
    val type: TransactionType
)
