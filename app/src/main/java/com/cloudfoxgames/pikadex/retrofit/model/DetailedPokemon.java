package com.cloudfoxgames.pikadex.retrofit.model;

import java.util.List;

public class DetailedPokemon {
    /**
     * location_area_encounters : https://pokeapi.co/api/v2/pokemon/12/encounters
     * types : [{"slot":2,"type":{"name":"flying","url":"https://pokeapi.co/api/v2/type/3/"}}]
     * base_experience : 178
     * held_items : [{"item":{"name":"silverpowder","url":"https://pokeapi.co/api/v2/item/199/"},"version_details":[{"version":{"name":"y","url":"https://pokeapi.co/api/v2/version/24/"},"rarity":5}]}]
     * weight : 320
     * is_default : true
     * sprites : {"back_shiny_female":"http://pokeapi.co/media/sprites/pokemon/back/shiny/female/12.png","back_female":"http://pokeapi.co/media/sprites/pokemon/back/female/12.png","other":{"dream_world":{},"officialartwork":{}},"back_default":"http://pokeapi.co/media/sprites/pokemon/back/12.png","front_shiny_female":"http://pokeapi.co/media/sprites/pokemon/shiny/female/12.png","front_default":"http://pokeapi.co/media/sprites/pokemon/12.png","versions":{"generationv":{"blackwhite":{}},"generationiii":{"fireredleafgreen":{},"rubysapphire":{},"emerald":{}},"generationiv":{"platinum":{},"diamondpearl":{},"heartgoldsoulsilver":{}},"generationvi":{"xy":{},"omegarubyalphasapphire":{}},"generationvii":{"ultrasunultramoon":{},"icons":{}},"generationii":{"gold":{},"crystal":{},"silver":{}},"generationi":{"redblue":{},"yellow":{}},"generationviii":{"icons":{}}},"front_female":"http://pokeapi.co/media/sprites/pokemon/female/12.png","back_shiny":"http://pokeapi.co/media/sprites/pokemon/back/shiny/12.png","front_shiny":"http://pokeapi.co/media/sprites/pokemon/shiny/12.png"}
     * abilities : [{"is_hidden":true,"slot":3,"ability":{"name":"tintedlens","url":"https://pokeapi.co/api/v2/ability/110/"}}]
     * game_indices : [{"game_index":12,"version":{"name":"white2","url":"https://pokeapi.co/api/v2/version/22/"}}]
     * species : {"name":"butterfree","url":"https://pokeapi.co/api/v2/pokemon-species/12/"}
     * stats : [{"stat":{"name":"speed","url":"https://pokeapi.co/api/v2/stat/6/"},"base_stat":70,"effort":0}]
     * moves : [{"version_group_details":[{"level_learned_at":0,"version_group":{"name":"xy","url":"https://pokeapi.co/api/v2/version-group/15/"},"move_learn_method":{"name":"machine","url":"https://pokeapi.co/api/v2/move-learn-method/4/"}}],"move":{"name":"flash","url":"https://pokeapi.co/api/v2/move/148/"}}]
     * name : butterfree
     * id : 12
     * forms : [{"name":"butterfree","url":"https://pokeapi.co/api/v2/pokemon-form/12/"}]
     * height : 11
     * order : 16
     */
    private String location_area_encounters;
    private List<TypesEntity> types;
    private int base_experience;
    private List<Held_itemsEntity> held_items;
    private int weight;
    private boolean is_default;
    private SpritesEntity sprites;
    private List<AbilitiesEntity> abilities;
    private List<Game_indicesEntity> game_indices;
    private SpeciesEntity species;
    private List<StatsEntity> stats;
    private List<MovesEntity> moves;
    private String name;
    private int id;
    private List<FormsEntity> forms;
    private int height;
    private int order;

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public void setTypes(List<TypesEntity> types) {
        this.types = types;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public void setHeld_items(List<Held_itemsEntity> held_items) {
        this.held_items = held_items;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public void setSprites(SpritesEntity sprites) {
        this.sprites = sprites;
    }

    public void setAbilities(List<AbilitiesEntity> abilities) {
        this.abilities = abilities;
    }

    public void setGame_indices(List<Game_indicesEntity> game_indices) {
        this.game_indices = game_indices;
    }

    public void setSpecies(SpeciesEntity species) {
        this.species = species;
    }

    public void setStats(List<StatsEntity> stats) {
        this.stats = stats;
    }

    public void setMoves(List<MovesEntity> moves) {
        this.moves = moves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setForms(List<FormsEntity> forms) {
        this.forms = forms;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public List<TypesEntity> getTypes() {
        return types;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public List<Held_itemsEntity> getHeld_items() {
        return held_items;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public SpritesEntity getSprites() {
        return sprites;
    }

    public List<AbilitiesEntity> getAbilities() {
        return abilities;
    }

    public List<Game_indicesEntity> getGame_indices() {
        return game_indices;
    }

    public SpeciesEntity getSpecies() {
        return species;
    }

    public List<StatsEntity> getStats() {
        return stats;
    }

    public List<MovesEntity> getMoves() {
        return moves;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<FormsEntity> getForms() {
        return forms;
    }

    public int getHeight() {
        return height;
    }

    public int getOrder() {
        return order;
    }
}
