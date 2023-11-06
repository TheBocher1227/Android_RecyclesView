package com.example.autosrecycleviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import Adapters.LamborguiniAdapter;
import Models.Lamborguini;
import Models.Motor;
import  Models.Llanta;
import Models.Auto;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

List<Lamborguini> lamborguinis=new ArrayList<>();
lamborguinis.add(new Lamborguini("Azul","Veneno",new Motor("V12",750),new Llanta(30,"Micheline")));
lamborguinis.add(new Lamborguini("Amarillo","Urus",new Motor("V8",650),new Llanta(35,"Micheline")));
lamborguinis.add(new Lamborguini("Rojo","Aventador", new Motor("V12",450),new Llanta(30,"Pirelli")));

        LamborguiniAdapter Lambo=new LamborguiniAdapter(lamborguinis);
        RecyclerView rv=findViewById(R.id.rvlambo);
        rv.setAdapter(Lambo);
rv.setLayoutManager(new LinearLayoutManager(this));
rv.setHasFixedSize(true);



    }
}