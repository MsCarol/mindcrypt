package com.carolkariuki.mindcrypt.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Currencies {


    @SerializedName("DZD")
    @Expose
    private Float dZD;
    @SerializedName("AOA")
    @Expose
    private Integer aOA;
    @SerializedName("XOF")
    @Expose
    private Float xOF;
    @SerializedName("BIF")
    @Expose
    private Float bIF;
    @SerializedName("EGP")
    @Expose
    private Float eGP;
    @SerializedName("ETB")
    @Expose
    private Float eTB;
    @SerializedName("GHS")
    @Expose
    private Float gHS;
    @SerializedName("KES")
    @Expose
    private Float kES;
    @SerializedName("MUR")
    @Expose
    private Float mUR;
    @SerializedName("ZAR")
    @Expose
    private Float zAR;
    @SerializedName("UGX")
    @Expose
    private Float uGX;
    @SerializedName("NGN")
    @Expose
    private Float nGN;
    @SerializedName("NAD")
    @Expose
    private Float nAD;
    @SerializedName("MAD")
    @Expose
    private Float mAD;
    @SerializedName("RWF")
    @Expose
    private Integer rWF;
    @SerializedName("BWP")
    @Expose
    private Float bWP;
    @SerializedName("TZS")
    @Expose
    private Float tZS;
    @SerializedName("ZMW")
    @Expose
    private Float zMW;
    @SerializedName("TND")
    @Expose
    private Float tND;

    public Float getDZD() {
        return dZD;
    }

    public void setDZD(Float dZD) {
        this.dZD = dZD;
    }

    public Integer getAOA() {
        return aOA;
    }

    public void setAOA(Integer aOA) {
        this.aOA = aOA;
    }

    public Float getXOF() {
        return xOF;
    }

    public void setXOF(Float xOF) {
        this.xOF = xOF;
    }

    public Float getBIF() {
        return bIF;
    }

    public void setBIF(Float bIF) {
        this.bIF = bIF;
    }

    public Float getEGP() {
        return eGP;
    }

    public void setEGP(Float eGP) {
        this.eGP = eGP;
    }

    public Float getETB() {
        return eTB;
    }

    public void setETB(Float eTB) {
        this.eTB = eTB;
    }

    public Float getGHS() {
        return gHS;
    }

    public void setGHS(Float gHS) {
        this.gHS = gHS;
    }

    public Float getKES() {
        return kES;
    }

    public void setKES(Float kES) {
        this.kES = kES;
    }

    public Float getMUR() {
        return mUR;
    }

    public void setMUR(Float mUR) {
        this.mUR = mUR;
    }

    public Float getZAR() {
        return zAR;
    }

    public void setZAR(Float zAR) {
        this.zAR = zAR;
    }

    public Float getUGX() {
        return uGX;
    }

    public void setUGX(Float uGX) {
        this.uGX = uGX;
    }

    public Float getNGN() {
        return nGN;
    }

    public void setNGN(Float nGN) {
        this.nGN = nGN;
    }

    public Float getNAD() {
        return nAD;
    }

    public void setNAD(Float nAD) {
        this.nAD = nAD;
    }

    public Float getMAD() {
        return mAD;
    }

    public void setMAD(Float mAD) {
        this.mAD = mAD;
    }

    public Integer getRWF() {
        return rWF;
    }

    public void setRWF(Integer rWF) {
        this.rWF = rWF;
    }

    public Float getBWP() {
        return bWP;
    }

    public void setBWP(Float bWP) {
        this.bWP = bWP;
    }

    public Float getTZS() {
        return tZS;
    }

    public void setTZS(Float tZS) {
        this.tZS = tZS;
    }

    public Float getZMW() {
        return zMW;
    }

    public void setZMW(Float zMW) {
        this.zMW = zMW;
    }

    public Float getTND() {
        return tND;
    }

    public void setTND(Float tND) {
        this.tND = tND;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dZD", dZD).append("aOA", aOA).append("xOF", xOF).append("bIF", bIF).append("eGP", eGP).append("eTB", eTB).append("gHS", gHS).append("kES", kES).append("mUR", mUR).append("zAR", zAR).append("uGX", uGX).append("nGN", nGN).append("nAD", nAD).append("mAD", mAD).append("rWF", rWF).append("bWP", bWP).append("tZS", tZS).append("zMW", zMW).append("tND", tND).toString();
    }

}