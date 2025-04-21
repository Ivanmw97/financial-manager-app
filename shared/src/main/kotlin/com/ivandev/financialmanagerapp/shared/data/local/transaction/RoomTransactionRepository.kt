package com.ivandev.financialmanagerapp.shared.data.local.transaction

import com.ivandev.financialmanagerapp.shared.data.model.Transaction
import com.ivandev.financialmanagerapp.shared.data.model.TransactionType
import com.ivandev.financialmanagerapp.shared.data.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.UUID

class RoomTransactionRepository(
    private val dao: TransactionDao
) : TransactionRepository {

    override suspend fun addTransaction(transaction: Transaction) {
        dao.insert(transaction.toEntity())
    }

    override suspend fun updateTransaction(transaction: Transaction) {
        dao.update(transaction.toEntity())
    }

    override suspend fun deleteTransaction(id: UUID) {
        dao.getById(id)?.let { dao.delete(it) }
    }

    override suspend fun getTransactionById(id: UUID): Transaction? {
        return dao.getById(id)?.toModel()
    }

    override fun getAllTransactions(): Flow<List<Transaction>> {
        return dao.getAll().map { it.map { e -> e.toModel() } }
    }

    override fun getTransactionsByCategory(category: String): Flow<List<Transaction>> {
        return dao.getByCategory(category).map { it.map { e -> e.toModel() } }
    }

    override fun getTransactionsByMonth(month: Int, year: Int): Flow<List<Transaction>> {
        return dao.getByMonth(month.toString().padStart(2, '0'), year.toString())
            .map { it.map { e -> e.toModel() } }
    }
}
