package com.cloudfoxgames.pikadex.data.viewmodel;

import android.util.Log;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.cloudfoxgames.pikadex.data.repository.PokemonRepository;
import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;

import java.util.ArrayList;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class PokemonViewModel extends ViewModel {
    private static final String TAG = "PokemonViewModel";

    private PokemonRepository pokemonRepository;
    //private MutableLiveData<ArrayList<Pokemon>> pokemonList = new MutableLiveData<>();
    private MutableLiveData<DetailedPokemon> detailedPokemon = new MutableLiveData<>();

    @ViewModelInject
    public PokemonViewModel(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    /*public MutableLiveData<ArrayList<Pokemon>> getPokemonList() {
        return pokemonList;
    }*/

    public MutableLiveData<DetailedPokemon> getDetailedPokemon() {
        return detailedPokemon;
    }

    public void getPokemon(int id) {
        pokemonRepository.getPokemon(id)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(result -> detailedPokemon.setValue(result),
                            error -> Log.e(TAG,"getPokemon:" + id + error.getMessage()));
    }

    /*public void getPokemons() {
        pokemonRepository.getPokemons()
                .subscribeOn(Schedulers.io())
                .map(new Function<PokemonResponse, ArrayList<Pokemon>>() {
                    @Override
                    public ArrayList<Pokemon> apply(PokemonResponse pokemonResponse) throws Throwable {
                        ArrayList<Pokemon> list = pokemonResponse.getResults();
                        for (Pokemon pokemon : list) {
                            String url = pokemon.getUrl();
                            String[] pokemonIndex = url.split("/");
                            pokemon.setId(Integer.parseInt(pokemonIndex[pokemonIndex.length-1]));
                            pokemon.setUrl("https://img.pokemondb.net/sprites/home/normal/"+pokemon.getName()+".png");
                        }
                        Log.e(TAG, "apply: "+list.get(2).getUrl());
                        return list;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(result -> pokemonList.setValue(result),
                        error -> Log.e(TAG,"getPokemons: "+ error.getMessage()));
    }*/
}
