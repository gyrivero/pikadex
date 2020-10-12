package com.cloudfoxgames.pikadex.retrofit.model;

public class SpritesEntity {
    /**
     * back_shiny_female : http://pokeapi.co/media/sprites/pokemon/back/shiny/female/12.png
     * back_female : http://pokeapi.co/media/sprites/pokemon/back/female/12.png
     * other : {"dream_world":{},"officialartwork":{}}
     * back_default : http://pokeapi.co/media/sprites/pokemon/back/12.png
     * front_shiny_female : http://pokeapi.co/media/sprites/pokemon/shiny/female/12.png
     * front_default : http://pokeapi.co/media/sprites/pokemon/12.png
     * versions : {"generationv":{"blackwhite":{}},"generationiii":{"fireredleafgreen":{},"rubysapphire":{},"emerald":{}},"generationiv":{"platinum":{},"diamondpearl":{},"heartgoldsoulsilver":{}},"generationvi":{"xy":{},"omegarubyalphasapphire":{}},"generationvii":{"ultrasunultramoon":{},"icons":{}},"generationii":{"gold":{},"crystal":{},"silver":{}},"generationi":{"redblue":{},"yellow":{}},"generationviii":{"icons":{}}}
     * front_female : http://pokeapi.co/media/sprites/pokemon/female/12.png
     * back_shiny : http://pokeapi.co/media/sprites/pokemon/back/shiny/12.png
     * front_shiny : http://pokeapi.co/media/sprites/pokemon/shiny/12.png
     */
    private String back_shiny_female;
    private String back_female;
    private OtherEntity other;
    private String back_default;
    private String front_shiny_female;
    private String front_default;
    private VersionsEntity versions;
    private String front_female;
    private String back_shiny;
    private String front_shiny;

    public void setBack_shiny_female(String back_shiny_female) {
        this.back_shiny_female = back_shiny_female;
    }

    public void setBack_female(String back_female) {
        this.back_female = back_female;
    }

    public void setOther(OtherEntity other) {
        this.other = other;
    }

    public void setBack_default(String back_default) {
        this.back_default = back_default;
    }

    public void setFront_shiny_female(String front_shiny_female) {
        this.front_shiny_female = front_shiny_female;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }

    public void setVersions(VersionsEntity versions) {
        this.versions = versions;
    }

    public void setFront_female(String front_female) {
        this.front_female = front_female;
    }

    public void setBack_shiny(String back_shiny) {
        this.back_shiny = back_shiny;
    }

    public void setFront_shiny(String front_shiny) {
        this.front_shiny = front_shiny;
    }

    public String getBack_shiny_female() {
        return back_shiny_female;
    }

    public String getBack_female() {
        return back_female;
    }

    public OtherEntity getOther() {
        return other;
    }

    public String getBack_default() {
        return back_default;
    }

    public String getFront_shiny_female() {
        return front_shiny_female;
    }

    public String getFront_default() {
        return front_default;
    }

    public VersionsEntity getVersions() {
        return versions;
    }

    public String getFront_female() {
        return front_female;
    }

    public String getBack_shiny() {
        return back_shiny;
    }

    public String getFront_shiny() {
        return front_shiny;
    }
}