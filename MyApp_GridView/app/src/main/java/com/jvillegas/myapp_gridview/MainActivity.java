package com.jvillegas.myapp_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    ArrayList<String> nombres=new ArrayList<>();
    ArrayList<Integer> imgA=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridViewId);
        this.cargarContenido();

    }
    private void cargarContenido(){

        nombres.add("Perro");
        nombres.add("Gato");
        nombres.add("Hamster");
        nombres.add("Tortuga");
        nombres.add("Loro");
        nombres.add("Huron");

        imgA.add(R.drawable.ic_perro);
        imgA.add(R.drawable.ic_feliz);
        imgA.add(R.drawable.ic_hamster);
        imgA.add(R.drawable.ic_tortuga);
        imgA.add(R.drawable.ic_loro);
        imgA.add(R.drawable.ic_huron);



        /*ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,nombres);
        gridView.setAdapter(adapter);*/
        AdaptadorGrid adaptadorGrid=new AdaptadorGrid(this,R.layout.grid_personalizado,nombres,imgA);
        gridView.setAdapter(adaptadorGrid);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "A pulsado "+nombres.get(position), Toast.LENGTH_SHORT).show(); 
            }
        });
    }


}