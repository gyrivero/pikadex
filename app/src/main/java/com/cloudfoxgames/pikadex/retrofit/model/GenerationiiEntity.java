package com.cloudfoxgames.pikadex.retrofit.model;

public class GenerationiiEntity {
    /**
     * gold : {}
     * crystal : {}
     * silver : {}
     */
    private GoldEntity gold;
    private CrystalEntity crystal;
    private SilverEntity silver;

    public void setGold(GoldEntity gold) {
        this.gold = gold;
    }

    public void setCrystal(CrystalEntity crystal) {
        this.crystal = crystal;
    }

    public void setSilver(SilverEntity silver) {
        this.silver = silver;
    }

    public GoldEntity getGold() {
        return gold;
    }

    public CrystalEntity getCrystal() {
        return crystal;
    }

    public SilverEntity getSilver() {
        return silver;
    }

    public class GoldEntity {
    }

    public class CrystalEntity {
    }

    public class SilverEntity {
    }
}
