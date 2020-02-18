package com.example.ngamia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @Expose
    @SerializedName("id") private  int id;

    @Expose
    @SerializedName("Surname") private String Surname;

    @Expose
    @SerializedName("Firstname") private String Firstname;


    @Expose
    @SerializedName("IdNo") private int Identification_Number;

    @Expose
    @SerializedName("password") private String Password;

    @Expose
    @SerializedName("success") private Boolean success;

    @Expose
    @SerializedName("message")private String message;


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public int getIdentification_Number() {
        return Identification_Number;
    }

    public void setIdentification_Number(int identification_Number) {
        Identification_Number = identification_Number;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
