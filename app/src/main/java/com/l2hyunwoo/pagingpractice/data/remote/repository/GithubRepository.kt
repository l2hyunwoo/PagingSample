package com.l2hyunwoo.pagingpractice.data.remote.repository

import androidx.paging.PagingData
import com.l2hyunwoo.pagingpractice.model.Repo
import kotlinx.coroutines.flow.Flow

interface GithubRepository {
    fun getSearchResultSteam(query: String): Flow<PagingData<Repo>>
}