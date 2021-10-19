package com.gomdolstudio.covidinfoapp.data.service

import com.gomdolstudio.covidinfoapp.data.CasesLocation
import com.gomdolstudio.covidinfoapp.data.NewsItems
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsService {
    @Headers("X-Naver-Client-Id: zoMtQ90jWwuCODfTK0__","X-Naver-Client-Secret: b0VLyOurD3")
    @GET("v1/search/news.json")
    fun getNews(
            @Query("query")query: String,
            @Query("display")display: Int,
            @Query("start")start: Int,
            @Query("sort")sort: String
    ): Single<NewsItems>
}