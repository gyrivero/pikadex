package com.cloudfoxgames.pikadex.retrofit.model;

public class Version_detailsEntity {
    /**
     * version : {"name":"y","url":"https://pokeapi.co/api/v2/version/24/"}
     * rarity : 5
     */
    private VersionEntity version;
    private int rarity;

    public void setVersion(VersionEntity version) {
        this.version = version;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public VersionEntity getVersion() {
        return version;
    }

    public int getRarity() {
        return rarity;
    }
}