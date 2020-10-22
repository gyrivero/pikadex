package com.cloudfoxgames.pikadex.retrofit;

import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokeApiService {
    /*@GET("pokemon?limit=893&offset=0")
    Observable<PokemonResponse> getPokemons();*/

    @GET("pokemon/{id}")
    Observable<DetailedPokemon> getPokemon(@Path("id") int id);
}
