package com.cloudfoxgames.pikadex.retrofit.model;

public class TypesEntity {
    /**
     * slot : 2
     * type : {"name":"flying","url":"https://pokeapi.co/api/v2/type/3/"}
     */
    private int slot;
    private TypeEntity type;

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public TypeEntity getType() {
        return type;
    }
}
