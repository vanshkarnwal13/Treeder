package com.brocode.carbon_footprint_app.models;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiHolder {

    @POST("carbon")
    Call<Result> getCarbon(@Body Food food);
}
