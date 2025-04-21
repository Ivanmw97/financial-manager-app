package com.ivandev.financialmanagerapp.shared.di

import com.ivandev.financialmanagerapp.shared.data.local.localModule
import org.koin.core.module.Module
import org.koin.dsl.module

val sharedModule: Module = module {
    includes(localModule)
}
