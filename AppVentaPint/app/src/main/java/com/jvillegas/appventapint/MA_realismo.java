package com.jvillegas.appventapint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MA_realismo extends AppCompatActivity {
    private ArrayList<String> autores=new ArrayList<>();
    private ArrayList<String> nombres=new ArrayList<>();
    private ArrayList<Integer> imgListado=new ArrayList<>();
    private ArrayList<Float> precio=new ArrayList<>();
    private ListView lView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_realismo);
        lView=findViewById(R.id.lstRealismo);
        this.cargar();
    }

    private void cargar(){
        // Autores
        autores.add("HONORE DAUMIER");
        autores.add("GUSTAVE COULBERT");
        autores.add("GUSTAVE COULBERT");
        autores.add("GUSTAVE COULBERT");

        // cargando los nombres
        nombres.add("El vagón de tercera clase");
        nombres.add("The Stonebreakers");
        nombres.add("El taller del pintor");
        nombres.add("Buenos días, señor Coulbert");

        // cargando imagenes
        imgListado.add(R.drawable.ic_realismo1);
        imgListado.add(R.drawable.ic_realismo2);
        imgListado.add(R.drawable.ic_realismo3);
        imgListado.add(R.drawable.ic_realismo4);

        //Precios
        precio.add(4500.00f);
        precio.add(3750.00f);
        precio.add(6000.00f);
        precio.add(5000.00f);

        AdaptadorGenerico adapter=new AdaptadorGenerico(this,R.layout.ma_formatos_cuadros,autores,imgListado,nombres,precio);
        lView.setAdapter(adapter);

    }
}