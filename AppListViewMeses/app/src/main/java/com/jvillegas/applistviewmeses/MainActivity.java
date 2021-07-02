package com.jvillegas.applistviewmeses;

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

    private ListView lst;
    ArrayList<String> mes=new ArrayList<>();
    ArrayList<Integer> cnt=new ArrayList<>();
    ArrayList<Integer> num=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst=findViewById(R.id.lstMes);

        //llenado de arraylist
        mes.add("Enero");
        mes.add("Febrero");
        mes.add("Marzo");
        mes.add("Abril");
        mes.add("Mayo");
        mes.add("Junio");
        mes.add("Julio");
        mes.add("Agosto");
        mes.add("Septiembre");
        mes.add("Octubre");
        mes.add("Noviembre");
        mes.add("Diciembre");

        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,mes);
        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Estas haciendo click en el elemento "+this.getClass().getFields(), Toast.LENGTH_SHORT).show();

            }
        });

    }// fin del metodo onCreate
}