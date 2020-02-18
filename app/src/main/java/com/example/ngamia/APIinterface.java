package com.example.ngamia;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIinterface{
    @FormUrlEncoded
    @POST("registerUser.php")
    Call<User> saveUSer(
            @Field("Surname") String Surname,
            @Field("Firstname") String FirstName,
            @Field("IdNo") int Identification_Number,
            @Field("password") String Password
        );

}
