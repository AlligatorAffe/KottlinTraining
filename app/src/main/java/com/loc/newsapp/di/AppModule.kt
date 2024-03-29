package com.loc.newsapp.di

import android.app.Application
import com.loc.newsapp.domain.usecases.AppEntryUseCases
import com.loc.newsapp.manager.LocalUserManagerImpl
import com.loc.newsapp.presentation.onboarding.data.domain.manager.LocalUserManager
import com.loc.newsapp.presentation.onboarding.domain.usecases.ReadAppEntry
import com.loc.newsapp.presentation.onboarding.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun providelocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger : LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )


}