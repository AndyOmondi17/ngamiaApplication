package com.example.ngamia;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIclient{
//    specify base url
//    192.168.1.226
//    http://localhost/NgamiaProject/Include/
    private static final String BASE_URL="http://192.168.1.226/NgamiaProject/Include/";

    private static Retrofit retrofit;

    public static Retrofit getApiClient(){
        if(retrofit == null){
//            create an instance of Retrofit
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
