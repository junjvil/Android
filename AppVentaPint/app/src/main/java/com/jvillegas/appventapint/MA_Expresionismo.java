package com.jvillegas.appventapint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MA_Expresionismo extends AppCompatActivity {
    private ArrayList<String> autor =new ArrayList<>();
    private ArrayList<String> nombre=new ArrayList<>();
    private ArrayList<Integer> lstExpre=new ArrayList<>();
    private ArrayList<Float> precio=new ArrayList<>();
    private ListView lstView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_expresionismo);
        lstView=findViewById(R.id.lstExpresionismo);
        cargar();
    }
    // metodo que permite cargar la informacion en la listview
    private void cargar(){

        // Arreglo de autores
        autor.add("Emil Nolde");
        autor.add("Kathe Kollwitz");
        autor.add("Ernst Ludwig Kirchner");
        autor.add("Franz Marc");

        // cargar nombre de pintura
        nombre.add("La crucifixion");
        nombre.add("Los sobrevivientes");
        nombre.add("Autorretrato como soldado");
        nombre.add("El destino de los animales");

        // cargando imagenes
        lstExpre.add(R.drawable.ic_expresionismo);
        lstExpre.add(R.drawable.ic_expresionismo1);
        lstExpre.add(R.drawable.ic_expresionismo2);
        lstExpre.add(R.drawable.ic_expresionismo3);

        //precios
        precio.add(4500.00f);
        precio.add(5500.00f);
        precio.add(6500.00f);
        precio.add(7500.00f);
        precio.add(8500.00f);

        //Adaptador generico
        AdaptadorGenerico adapter=new AdaptadorGenerico(this,R.layout.ma_formatos_cuadros,autor,lstExpre,nombre,precio);
        lstView.setAdapter(adapter);
    }// fin del metodo cargar
}