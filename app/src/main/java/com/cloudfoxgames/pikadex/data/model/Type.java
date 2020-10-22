package com.cloudfoxgames.pikadex.data.model;

import java.util.ArrayList;

public class Type {
    private int id;
    private String name;
    private ArrayList<Float> effectiveness;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Float> getEffectiveness() {
        return effectiveness;
    }
}
