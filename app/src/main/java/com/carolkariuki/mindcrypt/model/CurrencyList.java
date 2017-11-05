package com.carolkariuki.mindcrypt.model;

import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;

/**
 * Created by carolkariuki on 11/5/17.
 */

public class CurrencyList {

    @SerializedName("BIT")
    private ArrayList<Currencies> ratesList;

    public ArrayList<Currencies> getRatesArrayList() {
        return ratesList;
    }

    public void setRatesArrayList(ArrayList<Currencies> ratesArrayList) {
        this.ratesList = ratesArrayList;
    }




    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bIT", ratesList).toString();

    }


}