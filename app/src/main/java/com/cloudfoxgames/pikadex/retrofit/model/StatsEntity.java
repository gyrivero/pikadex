package com.cloudfoxgames.pikadex.retrofit.model;

public class StatsEntity {
    /**
     * stat : {"name":"speed","url":"https://pokeapi.co/api/v2/stat/6/"}
     * base_stat : 70
     * effort : 0
     */
    private StatEntity stat;
    private int base_stat;
    private int effort;

    public void setStat(StatEntity stat) {
        this.stat = stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public StatEntity getStat() {
        return stat;
    }

    public int getBase_stat() {
        return base_stat;
    }

    public int getEffort() {
        return effort;
    }
}
