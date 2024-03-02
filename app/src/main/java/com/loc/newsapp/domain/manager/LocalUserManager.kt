package com.loc.newsapp.presentation.onboarding.data.domain.manager

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {


    suspend fun saveAppEntry()

    fun readAppEntry() : Flow<Boolean>

}