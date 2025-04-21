package com.ivandev.financialmanagerapp.shared.data.repository

import com.ivandev.financialmanagerapp.shared.data.model.Budget
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface BudgetRepository {

    suspend fun addBudget(budget: Budget)

    suspend fun updateBudget(budget: Budget)

    suspend fun deleteBudget(id: UUID)

    fun getAllBudgets(): Flow<List<Budget>>

    fun getBudgetsByUser(userId: UUID): Flow<List<Budget>>

    fun getBudgetForCategoryAndMonth(category: String, month: String): Flow<Budget?>
}