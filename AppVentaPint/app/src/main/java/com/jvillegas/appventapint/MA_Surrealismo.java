package com.jvillegas.appventapint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MA_Surrealismo extends AppCompatActivity {

    private ArrayList<String> autor=new ArrayList<>();
    private ArrayList<String> nombre=new ArrayList<>();
    private ArrayList<Integer> lstSurrea=new ArrayList<>();
    private ArrayList<Float> precio=new ArrayList<>();
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_surrealismo);
        lv=findViewById(R.id.lstSurre);
        this.cargar();
    }
    private void cargar(){
        // cargar autores
        autor.add("Salvador Dalí");
        autor.add("René Magritte");
        autor.add("Man Ray");
        autor.add("Marc Chagall");


        // cargar nombre
        nombre.add("La persistencia de la memoria");
        nombre.add("La traición de la imagen (Esto no es una pipa)");
        nombre.add("Ecuación shakespeariana,");
        nombre.add("Yo y la aldea");

        // cargar imagenes
        lstSurrea.add(R.drawable.ic_surrealismo);
        lstSurrea.add(R.drawable.ic_surrealismo1);
        lstSurrea.add(R.drawable.ic_surrealismo2);
        lstSurrea.add(R.drawable.ic_surrealismo3);

        // cargar precios
        precio.add(8500.00f);
        precio.add(7000.00f);
        precio.add(7500.00f);
        precio.add(8000.00f);

        AdaptadorGenerico adaptador=new AdaptadorGenerico(this,R.layout.ma_formatos_cuadros,autor,lstSurrea,nombre,precio);
        lv.setAdapter(adaptador);


    }// fin del metodo cargar
}