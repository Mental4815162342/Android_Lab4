package com.example.lab_4;

import android.graphics.Color;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Cat {

    public String name; // имя
    public int age; // возраст
    public int color; // цвет

    public Cat(MainActivity mainActivity){
        String jsonText = "{\"name\":\"Мурзик\",\"color\":154864352,\"age\":9}";
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Cat murzik = gson.fromJson(jsonText, Cat.class);
        name = murzik.name;
        age = murzik.age;
        color = murzik.color;
        Log.i("GSON", "Имя: " + murzik.name + "\nВозраст: " + murzik.age);

    }

}
