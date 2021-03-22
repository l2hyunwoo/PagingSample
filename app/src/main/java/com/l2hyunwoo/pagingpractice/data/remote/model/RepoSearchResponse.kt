package com.l2hyunwoo.pagingpractice.data.remote.model

import com.google.gson.annotations.SerializedName
import com.l2hyunwoo.pagingpractice.model.Repo

data class RepoSearchResponse(
    @SerializedName("total_count") val total: Int = 0,
    @SerializedName("items") val items: List<Repo> = emptyList(),
    val nextPage: Int? = null
)
