package com.cloudfoxgames.pikadex.common;

import android.content.Context;

import com.cloudfoxgames.pikadex.data.model.Pokemon;
import com.cloudfoxgames.pikadex.data.model.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


import dagger.hilt.android.qualifiers.ApplicationContext;
public class Utils {
    private Context context;


    public Utils(Context context) {
        this.context = context;
    }

    public String getJsonDataFromAsset(String fileName) {
        String json = null;
        try {
            InputStream is = context.getApplicationContext().getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return json;
    }

    public ArrayList<Pokemon> jsonPokemonsParse(String filename) {
        Gson gson = new Gson();
        String fileJson = getJsonDataFromAsset(filename);
        java.lang.reflect.Type typeListOfPokemons = new TypeToken<List<Pokemon>>(){}.getType();
        ArrayList<Pokemon> listOfPokemons = gson.fromJson(fileJson, typeListOfPokemons);
        return listOfPokemons;
    }

    public List<Type> jsonTypesParse(String filename) {
        Gson gson = new Gson();
        String fileJson = getJsonDataFromAsset(filename);
        java.lang.reflect.Type typeListOfTypes = new TypeToken<List<Type>>(){}.getType();
        List<Type> listOfTypes = gson.fromJson(fileJson, typeListOfTypes);
        return listOfTypes;
    }

    /*fun jsonParse(fileName : String): List<JsonDino> {
        val gson = Gson()
        val fileJson = getJsonDataFromAsset(MyApp.instance, fileName)
        val listJson = object : TypeToken<List<JsonDino>>() {}.type
        var listDinos: List<JsonDino> = gson.fromJson(fileJson, listJson)
        return listDinos*/
}
