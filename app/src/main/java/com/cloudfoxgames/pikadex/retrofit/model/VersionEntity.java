package com.cloudfoxgames.pikadex.retrofit.model;

public class VersionEntity {
    /**
     * name : y
     * url : https://pokeapi.co/api/v2/version/24/
     */
    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
