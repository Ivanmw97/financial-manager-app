package com.ivandev.financialmanagerapp.shared.data.repository

import com.ivandev.financialmanagerapp.shared.data.model.Transaction
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface TransactionRepository {

    suspend fun addTransaction(transaction: Transaction)

    suspend fun updateTransaction(transaction: Transaction)

    suspend fun deleteTransaction(id: UUID)

    suspend fun getTransactionById(id: UUID): Transaction?

    fun getAllTransactions(): Flow<List<Transaction>>

    fun getTransactionsByCategory(category: String): Flow<List<Transaction>>

    fun getTransactionsByMonth(month: Int, year: Int): Flow<List<Transaction>>
}