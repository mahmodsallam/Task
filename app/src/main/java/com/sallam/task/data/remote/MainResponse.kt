package com.sallam.task.data.remote

data class MainResponse(
    val `data`: List<Data>,
    val status: Int
) {
    data class Data(
        val brand: String,
        val constructionYear: String,
        val id: Int,
        val imageUrl: String,
        val isUsed: Boolean
    )
}