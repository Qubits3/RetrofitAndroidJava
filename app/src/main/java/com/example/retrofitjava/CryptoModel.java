package com.example.retrofitjava;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("current")
    String currency;
    @SerializedName("price")
    String price;

}
