package com.cloudfoxgames.pikadex.retrofit.model;

import java.util.List;

public class Held_itemsEntity {
    /**
     * item : {"name":"silverpowder","url":"https://pokeapi.co/api/v2/item/199/"}
     * version_details : [{"version":{"name":"y","url":"https://pokeapi.co/api/v2/version/24/"},"rarity":5}]
     */
    private ItemEntity item;
    private List<Version_detailsEntity> version_details;

    public void setItem(ItemEntity item) {
        this.item = item;
    }

    public void setVersion_details(List<Version_detailsEntity> version_details) {
        this.version_details = version_details;
    }

    public ItemEntity getItem() {
        return item;
    }

    public List<Version_detailsEntity> getVersion_details() {
        return version_details;
    }
}