package com.l2hyunwoo.pagingpractice.data.remote.api

import com.l2hyunwoo.pagingpractice.data.remote.model.RepoSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {
    @GET("search/repositories?sort=stars")
    suspend fun searchRepos(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") itemsPerPage: Int
    ): RepoSearchResponse
}