package com.l2hyunwoo.pagingpractice.di

import com.l2hyunwoo.pagingpractice.data.remote.api.GithubService
import com.l2hyunwoo.pagingpractice.data.remote.repository.GithubRepository
import com.l2hyunwoo.pagingpractice.data.remote.repository.GithubRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideGithubRepository(service: GithubService): GithubRepository =
        GithubRepositoryImpl(service)
}