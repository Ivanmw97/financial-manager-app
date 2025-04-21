package com.ivandev.financialmanagerapp.shared.data.local

import androidx.room.Room
import com.ivandev.financialmanagerapp.shared.data.local.transaction.Converters
import com.ivandev.financialmanagerapp.shared.data.local.transaction.RoomTransactionRepository
import com.ivandev.financialmanagerapp.shared.data.repository.TransactionRepository
import org.koin.dsl.module

val localModule = module {

    single {
        Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            "financial_manager.db"
        )
            .addTypeConverter(get<Converters>())
            .fallbackToDestructiveMigration()
            .build()
    }

    single { get<AppDatabase>().transactionDao() }

    single<TransactionRepository> { RoomTransactionRepository(get()) }

    single { Converters() }
}
