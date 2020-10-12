package com.cloudfoxgames.pikadex.retrofit.model;

import java.util.List;

public class MovesEntity {
    /**
     * version_group_details : [{"level_learned_at":0,"version_group":{"name":"xy","url":"https://pokeapi.co/api/v2/version-group/15/"},"move_learn_method":{"name":"machine","url":"https://pokeapi.co/api/v2/move-learn-method/4/"}}]
     * move : {"name":"flash","url":"https://pokeapi.co/api/v2/move/148/"}
     */
    private List<Version_group_detailsEntity> version_group_details;
    private MoveEntity move;

    public void setVersion_group_details(List<Version_group_detailsEntity> version_group_details) {
        this.version_group_details = version_group_details;
    }

    public void setMove(MoveEntity move) {
        this.move = move;
    }

    public List<Version_group_detailsEntity> getVersion_group_details() {
        return version_group_details;
    }

    public MoveEntity getMove() {
        return move;
    }
}
