package com.loc.newsapp.presentation.onboarding.domain.usecases

import com.loc.newsapp.presentation.onboarding.data.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManger: LocalUserManager
){

    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }
}