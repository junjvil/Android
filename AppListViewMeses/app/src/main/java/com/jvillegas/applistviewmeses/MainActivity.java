package com.jvillegas.applistviewmeses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lst;
    private Button btn;
    ArrayList<String> mes=new ArrayList<>();
    ArrayList<Integer> cnt=new ArrayList<>();
    ArrayList<Integer> num=new ArrayList<>();
    private Toolbar toolbar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.myBar);
        setSupportActionBar(toolbar);

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

        // agregando el contenido
        cnt.add( R.string.Ene);
        cnt.add(R.string.Feb);
        cnt.add(R.string.Mar);
        cnt.add(R.string.Abr);
        cnt.add(R.string.May);
        cnt.add(R.string.Jun);
        cnt.add(R.string.Jul);
        cnt.add(R.string.Ago);
        cnt.add(R.string.Sep);
        cnt.add(R.string.Oct);
        cnt.add(R.string.Nov);
        cnt.add(R.string.Dic);

        // agregando numero 
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);
        num.add(11);
        num.add(12);
        

        AdaptadorLista adaptadorLista=new AdaptadorLista(this,R.layout.ma_vista_personalizada,mes,num);
        lst.setAdapter(adaptadorLista);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getApplicationContext(),MA_Meses.class);
                intent.putExtra("ms",mes.get(position));

                intent.putExtra("cont",cnt.get(position));
                startActivity(intent);
            }
        });// fin del asignador de eventos

    }// fin del metodo onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_list,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.item_info:
                Toast.makeText(this, "Bienvenido te dare informacion sobre la aplicacion ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_calen:
                Toast.makeText(this, "Seleccionaste la opcion de calendario", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_salir:
                Toast.makeText(this, "Saliedo de la aplicacion  hasta luego ", Toast.LENGTH_SHORT).show();
                finish();
                break;

        }// fin del selector de condicio
        return super.onOptionsItemSelected(item);
    }
}