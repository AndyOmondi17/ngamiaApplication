package com.example.ngamia;

import java.time.LocalDate;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


//basically what the interace does is containing methods that represent possible API calls
public interface APIinterface{
    @FormUrlEncoded

//    our method saveUser posts the endpoint registerUser.php of our base url
    @POST("registerUser.php")
//    target type is an Object of type users
    Call<User> saveUSer(
            @Field("Surname") String Surname,
            @Field("Firstname") String FirstName,
            @Field("Identification_Number") int Identification_Number,
            @Field("Password") String Password
        );


    @FormUrlEncoded
    @POST("riderRegistration.php")
    Call<User>riderRegistration(
            @Field("Identification_Number") int Identification_Number,
            @Field("Surname") String Surname,
            @Field("Firstname") String Firstname,
            @Field("NHIF_Number") int NHIF_Number,
            @Field("NSSF_Number") int NSSF_Number,
            @Field("Date_Of_Birth")LocalDate Date_Of_Birth,
            @Field("Gender") String Gender
            );

}
