package com.ivandev.financialmanagerapp.shared.data.model

import java.time.LocalDateTime
import java.util.UUID

data class Profile(
    val id: UUID,
    val createdAt: LocalDateTime,
    val email: String,
    val firstName: String,
    val lastName: String,
    val avatarUrl: String?,
    val currency: String,
    val theme: AppTheme
)

enum class AppTheme {
    LIGHT,
    DARK,
    SYSTEM
}
