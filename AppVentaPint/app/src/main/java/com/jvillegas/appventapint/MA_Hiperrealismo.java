package com.jvillegas.appventapint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MA_Hiperrealismo extends AppCompatActivity {
    private ArrayList<String> autor=new ArrayList<>();
    private ArrayList<String> nombre=new ArrayList<>();
    private ArrayList<Integer> listHiper=new ArrayList<>();
    private ArrayList<Float> prec=new ArrayList<>();
    private ListView lhView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_hiperrealismo);
        lhView=findViewById(R.id.lstHiperrealismo);
        addDatos();

    }//
    private void addDatos(){
        // agregando autores
        autor.add("Antonio Lopez");
        autor.add("Diego Fazio");
        autor.add("Paul Roberts");
        autor.add("Gina Heyer");

        //agregando nombres
        nombre.add("Pintura 1");
        nombre.add("Pintura 2");
        nombre.add("Pintura 3");
        nombre.add("Pintura 4");

        //cargando las imagenes
        listHiper.add(R.drawable.ic_hiperrealismo);
        listHiper.add(R.drawable.ic_hiperrealismo1);
        listHiper.add(R.drawable.ic_hiperrealismo2);
        listHiper.add(R.drawable.ic_hiperrealismo3);

        // agregando precios
        prec.add(4750.00f);
        prec.add(4500.00f);
        prec.add(5075.00f);
        prec.add(6500.00f);

        AdaptadorGenerico adapter=new AdaptadorGenerico(this,R.layout.ma_formatos_cuadros,autor,listHiper,nombre,prec);
        lhView.setAdapter(adapter);


    }// fin del metodo addDatos
}