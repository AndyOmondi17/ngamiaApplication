package com.example.ngamia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

//Model class used by retrofit for sending and receiving requests
public class User {

    //the annotations are used by GSON(Google Gson) to perform serialisation an deserialisation
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
    @SerializedName("NHIF_Number") private int NHIF_Number;



    @Expose
    @SerializedName("NSSF_Number") private int NSSF_Number;

    @Expose
    @SerializedName("Date_Of_Birth") private LocalDate Date_Of_Birth;

    @Expose
    @SerializedName("Gender") private String Gender;

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

    public int getNHIF_Number() {
        return NHIF_Number;
    }

    public void setNHIF_Number(int NHIF_Number) {
        this.NHIF_Number = NHIF_Number;
    }

    public int getNSSF_Number() {
        return NSSF_Number;
    }

    public void setNSSF_Number(int NSSF_Number) {
        this.NSSF_Number = NSSF_Number;
    }

    public LocalDate getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public void setDate_Of_Birth(LocalDate date_Of_Birth) {
        Date_Of_Birth = date_Of_Birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
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
