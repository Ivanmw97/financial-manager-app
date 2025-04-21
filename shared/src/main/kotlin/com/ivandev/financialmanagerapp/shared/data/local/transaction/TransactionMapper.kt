package com.ivandev.financialmanagerapp.shared.data.local.transaction

import com.ivandev.financialmanagerapp.shared.data.model.Transaction

fun Transaction.toEntity(): TransactionEntity =
    TransactionEntity(id, createdAt, userId, amount, date, description, category, type)

fun TransactionEntity.toModel(): Transaction =
    Transaction(id, createdAt, userId, amount, date, description, category, type)
