package com.example.lab_4;

import android.graphics.Color;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Cat {

    public String name; // имя
    public int age; // возраст
    public int color; // цвет

    public Cat(){
        String jsonText = "{\"name\":\"Мурзик\",\"color\":-16777216,\"age\":9}";

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Cat murzik = gson.fromJson(jsonText, Cat.class);
        Log.i("GSON", "Имя: " + murzik.name + "\nВозраст: " + murzik.age);
    }
}
