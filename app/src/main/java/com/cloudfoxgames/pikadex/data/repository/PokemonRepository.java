package com.cloudfoxgames.pikadex.data.repository;

import com.cloudfoxgames.pikadex.retrofit.PokeApiService;
import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

public class PokemonRepository {
    private PokeApiService pokeApiService;

    @Inject
    public PokemonRepository(PokeApiService pokeApiService) {
        this.pokeApiService = pokeApiService;
    }

    /*public Observable<PokemonResponse> getPokemons() {
        return pokeApiService.getPokemons();
    }*/

    public Observable<DetailedPokemon> getPokemon(int id) {return pokeApiService.getPokemon(id);}
}
