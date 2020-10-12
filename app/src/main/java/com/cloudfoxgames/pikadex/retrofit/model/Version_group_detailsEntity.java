package com.cloudfoxgames.pikadex.retrofit.model;

public class Version_group_detailsEntity {
    /**
     * level_learned_at : 0
     * version_group : {"name":"xy","url":"https://pokeapi.co/api/v2/version-group/15/"}
     * move_learn_method : {"name":"machine","url":"https://pokeapi.co/api/v2/move-learn-method/4/"}
     */
    private int level_learned_at;
    private Version_groupEntity version_group;
    private Move_learn_methodEntity move_learn_method;

    public void setLevel_learned_at(int level_learned_at) {
        this.level_learned_at = level_learned_at;
    }

    public void setVersion_group(Version_groupEntity version_group) {
        this.version_group = version_group;
    }

    public void setMove_learn_method(Move_learn_methodEntity move_learn_method) {
        this.move_learn_method = move_learn_method;
    }

    public int getLevel_learned_at() {
        return level_learned_at;
    }

    public Version_groupEntity getVersion_group() {
        return version_group;
    }

    public Move_learn_methodEntity getMove_learn_method() {
        return move_learn_method;
    }
}
