package com.example.recyclerview_con_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewjugador;
    private RecyclerviewAdaptador adaptadorjugador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewjugador=(RecyclerView)findViewById(R.id.recyclerJugador);
        recyclerViewjugador.setLayoutManager(new LinearLayoutManager(this));

        adaptadorjugador=new RecyclerviewAdaptador(obtenerjugador());
        recyclerViewjugador.setAdapter(adaptadorjugador);

    }
    public List<jugadorfutbol> obtenerjugador(){
        List<jugadorfutbol> jugador=new ArrayList<>();
        jugador.add(new jugadorfutbol("leonel Messi","Argentino",R.drawable.imago0048025040h));
        jugador.add(new jugadorfutbol("Karim benzema","frances",R.drawable.benzema));
        jugador.add(new jugadorfutbol("Neymar JR","brasileño",R.drawable.neyjrs));
        jugador.add(new jugadorfutbol("Kylian Mbappe","Frances",R.drawable.kylian));
        jugador.add(new jugadorfutbol("Cristiano Ronaldo","Portugues",R.drawable.cris));
        return jugador;

    }
}