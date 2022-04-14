package com.coding.imdbkotlin.data.api

import com.coding.imdbkotlin.data.vo.search.SearchMovie
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WebServiceInterface {
    //http://www.omdbapi.com/?t=Harry+potter&apikey=d0135a7f

    @GET("/")
    fun getPopularMovie(@Query("t") movie: String,
                        @Query("apikey") apikey: String): Single<SearchMovie>

}