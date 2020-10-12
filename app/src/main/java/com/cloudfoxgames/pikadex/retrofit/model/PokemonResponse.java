package com.cloudfoxgames.pikadex.retrofit.model;

import java.util.ArrayList;
import java.util.List;

public class PokemonResponse {
    /**
     * next : https://pokeapi.co/api/v2/ability/?limit=20&offset=20
     * previous : null
     * count : 248
     * results : [{"name":"stench","url":"https://pokeapi.co/api/v2/ability/1/"}]
     */
    private String next;
    private String previous;
    private int count;
    private ArrayList<Pokemon> results;

    public PokemonResponse(int count, String next, String previous, ArrayList<Pokemon> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }


    public void setNext(String next) {
        this.next = next;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Pokemon> getResults() {
        return results;
    }
}
