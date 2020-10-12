package com.cloudfoxgames.pikadex.retrofit.model;

public class Game_indicesEntity {
    /**
     * game_index : 12
     * version : {"name":"white2","url":"https://pokeapi.co/api/v2/version/22/"}
     */
    private int game_index;
    private VersionEntity version;

    public void setGame_index(int game_index) {
        this.game_index = game_index;
    }

    public void setVersion(VersionEntity version) {
        this.version = version;
    }

    public int getGame_index() {
        return game_index;
    }

    public VersionEntity getVersion() {
        return version;
    }
}
