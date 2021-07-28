package com.jvillegas.appventapint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MA_Impresionismo extends AppCompatActivity {

    private ArrayList<String> autor=new ArrayList<>();
    private ArrayList<String> nombre=new ArrayList<>();
    private ArrayList<Integer> lstImprec=new ArrayList<>();
    private ArrayList<Float> precio=new ArrayList<>();
    private ListView lView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_impresionismo);
        lView=findViewById(R.id.lstImpre);
        this.cargar();

    }
    private void cargar(){
        // cargando autores
        autor.add("Frederic Bazille");
        autor.add("Marie Bracquemond");
        autor.add("Gustave Caillebotte");
        autor.add("William Merritt Chase");

        // cargar nombre
        nombre.add("Latelier de Bazille");
        nombre.add("Auf der Terrasse in Sevres");
        nombre.add("Rue de Paris temps de pluie ");
        nombre.add("Landscape Shinnecock Long Island");

        // cargar imagenes
        lstImprec.add(R.drawable.ic_imprecionismo);
        lstImprec.add(R.drawable.ic_imprecionismo1);
        lstImprec.add(R.drawable.ic_imprecionismo2);
        lstImprec.add(R.drawable.ic_imprecionismo3);

        // cargar precios
        precio.add(4500.00f);
        precio.add(5000.00f);
        precio.add(5500.00f);
        precio.add(6000.00f);

        // Agregando el adaptador de la clase
        AdaptadorGenerico adapter=new AdaptadorGenerico(this,R.layout.ma_formatos_cuadros,autor,lstImprec,nombre,precio);
        lView.setAdapter(adapter);

    }// fin del metodo cargar

}