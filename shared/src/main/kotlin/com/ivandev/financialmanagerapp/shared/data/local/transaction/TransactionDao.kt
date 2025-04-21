package com.ivandev.financialmanagerapp.shared.data.local.transaction

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import java.util.UUID

@Dao
interface TransactionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(transaction: TransactionEntity)

    @Update
    suspend fun update(transaction: TransactionEntity)

    @Delete
    suspend fun delete(transaction: TransactionEntity)

    @Query("SELECT * FROM transactions WHERE id = :id")
    suspend fun getById(id: UUID): TransactionEntity?

    @Query("SELECT * FROM transactions")
    fun getAll(): Flow<List<TransactionEntity>>

    @Query("SELECT * FROM transactions WHERE category = :category")
    fun getByCategory(category: String): Flow<List<TransactionEntity>>

    @Query("SELECT * FROM transactions WHERE strftime('%m', date) = :month AND strftime('%Y', date) = :year")
    fun getByMonth(month: String, year: String): Flow<List<TransactionEntity>>
}
