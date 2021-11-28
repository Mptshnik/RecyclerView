package com.example.recyclerviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Film> _films = new ArrayList<Film>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitializeFilms();

        RecyclerView rw = findViewById(R.id.RW);
        rw.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        FilmAdapter adapter = new FilmAdapter(this, _films);
        rw.setAdapter(adapter);
    }

    private void InitializeFilms()
    {
        for(int i = 1; i < 30; i++)
        {
            _films.add(new Film("Фильм " + i, R.drawable.spiderman));
        }




    }
}