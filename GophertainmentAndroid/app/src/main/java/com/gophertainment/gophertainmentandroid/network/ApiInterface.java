package com.gophertainment.gophertainmentandroid.network;

import com.gophertainment.gophertainmentandroid.model.JsonResult;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by dakshsharma on 7/22/17.
 */

public interface ApiInterface {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json",
            "User-Agent: Android Gophertainment"
    })


    @POST("search")
    Call<JsonResult> getMultiSearchResult(@QueryMap Map<String,String> usersearchstring);

}
