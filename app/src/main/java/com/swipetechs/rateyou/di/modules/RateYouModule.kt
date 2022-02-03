package com.swipetechs.rateyou.di.modules

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RateYouModule{
    @Provides
    @Singleton
    fun provideFirebaseAuth() : FirebaseAuth{
        val firebaseAuth =  FirebaseAuth.getInstance()
        return firebaseAuth
    }
}