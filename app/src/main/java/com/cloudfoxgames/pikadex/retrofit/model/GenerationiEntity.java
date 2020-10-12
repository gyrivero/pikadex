package com.cloudfoxgames.pikadex.retrofit.model;

public class GenerationiEntity {
    /**
     * redblue : {}
     * yellow : {}
     */
    private RedblueEntity redblue;
    private YellowEntity yellow;

    public void setRedblue(RedblueEntity redblue) {
        this.redblue = redblue;
    }

    public void setYellow(YellowEntity yellow) {
        this.yellow = yellow;
    }

    public RedblueEntity getRedblue() {
        return redblue;
    }

    public YellowEntity getYellow() {
        return yellow;
    }

    public class RedblueEntity {
    }

    public class YellowEntity {
    }
}
