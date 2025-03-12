package com.example.retrofitapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofirInstance {

    private static Retrofit retrofit;
    private static final String BASEURL="https://jsonplaceholder.typicode.com/";

    public static Retrofit getRetrofit() {

        if (retrofit==null){
            retrofit=new Retrofit.Builder().
                    baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).
                    build();
        }

        return retrofit;
    }
}
