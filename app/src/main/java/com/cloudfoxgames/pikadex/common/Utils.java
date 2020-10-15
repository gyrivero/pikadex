package com.cloudfoxgames.pikadex.common;

import android.content.Context;

import com.cloudfoxgames.pikadex.data.model.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.inject.Inject;


import dagger.hilt.android.qualifiers.ApplicationContext;
public class Utils {
    private Context context;


    public Utils(Context context) {
        this.context = context;
    }

    private String getJsonDataFromAsset(String fileName) {
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

    public List<Type> jsonParse(String filename) {
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
