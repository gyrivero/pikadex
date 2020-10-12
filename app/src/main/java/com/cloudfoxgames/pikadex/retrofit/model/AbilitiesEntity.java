package com.cloudfoxgames.pikadex.retrofit.model;

public class AbilitiesEntity {
    /**
     * is_hidden : true
     * slot : 3
     * ability : {"name":"tintedlens","url":"https://pokeapi.co/api/v2/ability/110/"}
     */
    private boolean is_hidden;
    private int slot;
    private AbilityEntity ability;

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void setAbility(AbilityEntity ability) {
        this.ability = ability;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public AbilityEntity getAbility() {
        return ability;
    }
}
