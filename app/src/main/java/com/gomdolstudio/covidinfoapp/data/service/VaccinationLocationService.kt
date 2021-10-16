package com.gomdolstudio.covidinfoapp.data.service

import com.gomdolstudio.covidinfoapp.data.VaccinationLocation
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface VaccinationLocationService {
    @GET("15077756/v1/vaccine-stat")
    fun getVaccinationLocation(
        @Query("page")page: String,
        @Query("perPage")perPage: String,
        @Query("serviceKey")serviceKey: String,
        @Query("cond[baseDate::EQ]")baseDate: String
    ): Single<VaccinationLocation>

}