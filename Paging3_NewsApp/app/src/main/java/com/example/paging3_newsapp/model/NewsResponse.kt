package com.example.paging3_newsapp.model

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
