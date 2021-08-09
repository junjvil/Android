package com.jvillegas.actividad_utilizacindegridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gVista;
    private ArrayList<String> nColores=new ArrayList<>();
    private ArrayList<Integer> lColores=new ArrayList<>();
    private ArrayList<Integer> vColores=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gVista=findViewById(R.id.gridVista);
        this.cargar();

    }// fin del metodo onCreate

    private void cargar(){

        // colores
        nColores.add("Rojo");
        nColores.add("Rojo Claro");
        nColores.add("Amarillo");
        nColores.add("Amarillo Oscuro");
        nColores.add("Azul");
        nColores.add("Celeste");
        nColores.add("Verde Oscuro");
        nColores.add("Verde");
        nColores.add("Verde Claro");
        nColores.add("Rosado");
        nColores.add("Violeta");
        nColores.add("Morado");
        nColores.add("Negro");
        nColores.add("Gris");
        nColores.add("Blanco");

        // imagenes colores
        lColores.add(R.drawable.ic_rojo);
        lColores.add(R.drawable.ic_rojo_claro);
        lColores.add(R.drawable.ic_amarilla);
        lColores.add(R.drawable.ic_amarillo_oscuro);
        lColores.add(R.drawable.ic_azul);
        lColores.add(R.drawable.ic_celeste);
        lColores.add(R.drawable.ic_verde_oscuro);
        lColores.add(R.drawable.ic_verde);
        lColores.add(R.drawable.ic_verde_claro);
        lColores.add(R.drawable.ic_rosa);
        lColores.add(R.drawable.ic_violeta);
        lColores.add(R.drawable.ic_morado);
        lColores.add(R.drawable.ic_negro);
        lColores.add(R.drawable.ic_gris);
        lColores.add(R.drawable.ic_blanco);

        // valor de los colores en exadecimal
        vColores.add(Color.parseColor("#FF0000"));
        vColores.add(Color.parseColor("#CD5C5C"));
        vColores.add(Color.parseColor("#FFFF00"));
        vColores.add(Color.parseColor("#DAA520"));
        vColores.add(Color.parseColor("#0000FF"));
        vColores.add(Color.parseColor("#87CEEB"));
        vColores.add(Color.parseColor("#006400"));
        vColores.add(Color.parseColor("#008000"));
        vColores.add(Color.parseColor("#90EE90"));
        vColores.add(Color.parseColor("#FFC0CB"));
        vColores.add(Color.parseColor("#800080"));
        vColores.add(Color.parseColor("#DDA0DD"));
        vColores.add(Color.parseColor("#000000"));
        vColores.add(Color.parseColor("#808080"));
        vColores.add(Color.parseColor("#FFFFFF"));

        /*ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,lColores);
        gVista.setAdapter(adapter);*/

        AdaptadorPersonalizado personalizado=new AdaptadorPersonalizado(this,R.layout.grid_personalizado,lColores,nColores,vColores);
        gVista.setAdapter(personalizado);

        gVista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "A pulsado " + nColores.get(position), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),MA_Color.class);
                intent.putExtra("nombre",nColores.get(position));
                intent.putExtra("imagen",lColores.get(position));
                intent.putExtra("valor",vColores.get(position));
                startActivity(intent);
            }
        });//fin de la programacion del evento




    }// fin del metodo cargar

}