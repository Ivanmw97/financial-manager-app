package com.ivandev.financialmanagerapp.shared.data.remote

import com.ivandev.financialmanagerapp.shared.utils.EnvConfig
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.serializer.KotlinXSerializer
import kotlinx.serialization.json.Json

object SupabaseClientProvider {

    fun createClient(): SupabaseClient {
        return createSupabaseClient(
            supabaseUrl = EnvConfig.supabaseUrl,
            supabaseKey = EnvConfig.supabaseKey
        ) {
            defaultSerializer = KotlinXSerializer(Json {
                ignoreUnknownKeys = true
                encodeDefaults = true
                }
            )
            install(Postgrest)
        }
    }
}
