package com.example.lab_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Cat murzik = new Cat(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Cats = findViewById(R.id.Cats);

        Cats.setText(murzik.name + ", " + murzik.age + " лет, цвет:");
        View view = findViewById(R.id.view);
        view.setBackgroundColor(murzik.color);
    }
}