package com.gomdolstudio.covidinfoapp.data.service

import com.gomdolstudio.covidinfoapp.data.VaccinationCenter
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface VaccinationCenterService {
    @GET("15077586/v1/centers")
    fun getVaccinationCenter(
        @Query("page")page: String,
        @Query("perPage")perPage: String,
        @Query("serviceKey")serviceKey: String
        ): Single<VaccinationCenter>
}