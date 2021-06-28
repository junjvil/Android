package com.jvillegas.myapplista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    ArrayList<String> vocales=new ArrayList<>();
    ArrayList<Integer> img= new ArrayList<>();
    ArrayList<Integer> info=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.listaVocales);

        //lenado de arrayList
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");

        //llenado de arraylist
        img.add(R.drawable.ic_a);
        img.add(R.drawable.ic_e);
        img.add(R.drawable.ic_i);
        img.add(R.drawable.ic_o);
        img.add(R.drawable.ic_u);

        info.add(R.string.dato1);
        info.add(R.string.dato2);
        info.add(R.string.dato3);
        info.add(R.string.dato4);
        info.add(R.string.dato5);

        //Declaracion del adaptado de la informacion de la lista
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,vocales);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "A pulsado"+vocales.get(position), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),MA_Vocales.class);
                intent.putExtra("imagen",img.get(position));
                intent.putExtra("texto",info.get(position));
                startActivity(intent);
            }
        });

    }
}