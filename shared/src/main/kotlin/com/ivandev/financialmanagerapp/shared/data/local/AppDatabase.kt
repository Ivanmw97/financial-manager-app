package com.ivandev.financialmanagerapp.shared.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ivandev.financialmanagerapp.shared.data.local.transaction.Converters
import com.ivandev.financialmanagerapp.shared.data.local.transaction.TransactionDao
import com.ivandev.financialmanagerapp.shared.data.local.transaction.TransactionEntity

@Database(
    entities = [TransactionEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun transactionDao(): TransactionDao
}