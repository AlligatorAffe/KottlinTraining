package com.loc.newsapp.domain.usecases

import com.loc.newsapp.presentation.onboarding.domain.usecases.ReadAppEntry
import com.loc.newsapp.presentation.onboarding.domain.usecases.SaveAppEntry

data class AppEntryUseCases(
    val readAppEntry: ReadAppEntry,
    val saveAppEntry: SaveAppEntry
)
