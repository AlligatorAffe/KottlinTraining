package com.loc.newsapp.presentation.onboarding.domain.usecases

import com.loc.newsapp.presentation.onboarding.data.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManger: LocalUserManager){

    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }
}