package com.cloudfoxgames.pikadex.retrofit.model;

public class Pokemon {
    /**
     * name : stench
     * url : https://pokeapi.co/api/v2/ability/1/
     */
    private int id;
    private String name;
    private String url;

    public Pokemon(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
