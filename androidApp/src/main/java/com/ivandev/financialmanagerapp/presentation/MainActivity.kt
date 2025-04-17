package com.ivandev.financialmanagerapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ivandev.financialmanagerapp.presentation.theme.FinancialManagerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinancialManagerAppTheme {
                FinancialManagerApp()
            }
        }
    }
}
