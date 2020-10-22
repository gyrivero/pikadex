package com.cloudfoxgames.pikadex.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Pokemon implements Serializable {
    @SerializedName("id") private int id;
    @SerializedName("identifier") private String name;
    @SerializedName("species_id") private int speciesId;
    @SerializedName("height") private float height;
    @SerializedName("weight") private float weight;
    @SerializedName("base_experience") private float baseExperience;
    @SerializedName("hp") private int baseHP;
    @SerializedName("ataque") private int baseAttack;
    @SerializedName("defensa") private int baseDefense;
    @SerializedName("ataque especial") private int baseSpecialAttack;
    @SerializedName("defensa especial") private int baseSpecialDefense;
    @SerializedName("velocidad") private int baseSpeed;
    @SerializedName("type 1") private int type1;
    @SerializedName("type 2") private int type2;
    private String url;
    private Type primaryType;
    private Type secondaryType;

    public Type getPrimaryType() {
        return primaryType;
    }

    public void setPrimaryType(Type primaryType) {
        this.primaryType = primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(Type secondaryType) {
        this.secondaryType = secondaryType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpeciesId() {
        return speciesId;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float getBaseExperience() {
        return baseExperience;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public int getBaseSpecialAttack() {
        return baseSpecialAttack;
    }

    public int getBaseSpecialDefense() {
        return baseSpecialDefense;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public int getType1() {
        return type1;
    }

    public int getType2() {
        return type2;
    }
}
