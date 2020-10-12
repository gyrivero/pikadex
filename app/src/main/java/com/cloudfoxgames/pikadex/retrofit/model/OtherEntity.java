package com.cloudfoxgames.pikadex.retrofit.model;

public class OtherEntity {
    /**
     * dream_world : {}
     * officialartwork : {}
     */
    private Dream_worldEntity dream_world;
    private OfficialartworkEntity officialartwork;

    public void setDream_world(Dream_worldEntity dream_world) {
        this.dream_world = dream_world;
    }

    public void setOfficialartwork(OfficialartworkEntity officialartwork) {
        this.officialartwork = officialartwork;
    }

    public Dream_worldEntity getDream_world() {
        return dream_world;
    }

    public OfficialartworkEntity getOfficialartwork() {
        return officialartwork;
    }

    public class Dream_worldEntity {
    }

    public class OfficialartworkEntity {
    }
}
