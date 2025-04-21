package com.ivandev.financialmanagerapp.shared.data.repository

import com.ivandev.financialmanagerapp.shared.data.model.Profile
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface ProfileRepository {

    suspend fun createOrUpdateProfile(profile: Profile)

    suspend fun getProfileById(id: UUID): Profile?

    fun getCurrentUserProfile(): Flow<Profile?>
}