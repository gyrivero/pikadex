package com.cloudfoxgames.pikadex.retrofit.model;

public class GenerationivEntity {
    /**
     * platinum : {}
     * diamondpearl : {}
     * heartgoldsoulsilver : {}
     */
    private PlatinumEntity platinum;
    private DiamondpearlEntity diamondpearl;
    private HeartgoldsoulsilverEntity heartgoldsoulsilver;

    public void setPlatinum(PlatinumEntity platinum) {
        this.platinum = platinum;
    }

    public void setDiamondpearl(DiamondpearlEntity diamondpearl) {
        this.diamondpearl = diamondpearl;
    }

    public void setHeartgoldsoulsilver(HeartgoldsoulsilverEntity heartgoldsoulsilver) {
        this.heartgoldsoulsilver = heartgoldsoulsilver;
    }

    public PlatinumEntity getPlatinum() {
        return platinum;
    }

    public DiamondpearlEntity getDiamondpearl() {
        return diamondpearl;
    }

    public HeartgoldsoulsilverEntity getHeartgoldsoulsilver() {
        return heartgoldsoulsilver;
    }

    public class PlatinumEntity {
    }

    public class DiamondpearlEntity {
    }

    public class HeartgoldsoulsilverEntity {
    }
}
