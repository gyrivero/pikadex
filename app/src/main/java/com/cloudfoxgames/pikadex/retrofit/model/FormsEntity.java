package com.cloudfoxgames.pikadex.retrofit.model;

public class FormsEntity {
    /**
     * name : butterfree
     * url : https://pokeapi.co/api/v2/pokemon-form/12/
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
