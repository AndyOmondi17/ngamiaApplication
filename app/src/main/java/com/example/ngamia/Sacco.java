package com.example.ngamia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sacco {

    @Expose
    @SerializedName("Sacco_Id") private int Sacco_Id;

    @Expose
    @SerializedName("Sacco_Name") private String Sacco_Name;

    @Expose
    @SerializedName("Subcounty") private String Subcounty;

    @Expose
    @SerializedName("Ward") private String Ward;

    @Expose
    @SerializedName("Longitude") private double Latitude;

    @Expose
    @SerializedName("Longitude") private double Longitude;

    public int getSacco_Id() {
        return Sacco_Id;
    }

    public void setSacco_Id(int sacco_Id) {
        Sacco_Id = sacco_Id;
    }

    public String getSacco_Name() {
        return Sacco_Name;
    }

    public void setSacco_Name(String sacco_Name) {
        Sacco_Name = sacco_Name;
    }

    public String getSubcounty() {
        return Subcounty;
    }

    public void setSubcounty(String subcounty) {
        Subcounty = subcounty;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String ward) {
        Ward = ward;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }
}
