package com.l2hyunwoo.pagingpractice.data.remote.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.l2hyunwoo.pagingpractice.data.remote.api.GithubService
import com.l2hyunwoo.pagingpractice.model.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val service: GithubService
) : GithubRepository {
    override fun getSearchResultSteam(query: String): Flow<PagingData<Repo>> =
        Pager(
            config = PagingConfig(
                pageSize = NETWORK_PAGE_SIZE,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { GithubPagingSource(service, query) }
        ).flow
}