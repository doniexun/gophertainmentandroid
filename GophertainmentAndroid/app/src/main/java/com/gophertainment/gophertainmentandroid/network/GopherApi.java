package com.gophertainment.gophertainmentandroid.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dakshsharma on 7/22/17.
 */

public class GopherApi {

    final static String BASE_URL = "http://10.0.2.2:8080/";
    final static String SERVER_URL = "http://gophertainment.com/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
