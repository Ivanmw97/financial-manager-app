package com.ivandev.financialmanagerapp.shared.utils

import io.github.cdimascio.dotenv.dotenv

object EnvConfig {
    private val dotenv = dotenv {
        directory = "../../.."
        ignoreIfMissing = false
    }

    val supabaseUrl: String get() = dotenv["SUPABASE_URL"] ?: error("SUPABASE_URL not found in .env")
    val supabaseKey: String get() = dotenv["SUPABASE_KEY"] ?: error("SUPABASE_KEY not found in .env")
}
