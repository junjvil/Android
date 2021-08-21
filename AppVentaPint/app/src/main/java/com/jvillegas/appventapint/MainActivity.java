package com.jvillegas.appventapint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private ListView lst;
    private ArrayList<String> ctgr=new ArrayList<>();

    // instacia de objetos
    ArrayList<String> gRealismo=new ArrayList<String>();
    ArrayList<String> gHiperrealismo=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.tlbMenu);
        setSupportActionBar(toolbar);
        this.agregarElementos();
    }
    private void agregarElementos(){
        lst =findViewById(R.id.lstCategorias);

        // agregando las categorias al arraylist
        ctgr.add("Realismo");
        ctgr.add("Hiperrealismo");
        ctgr.add("Surrealismo");
        ctgr.add("Impresionismo");
        ctgr.add("Expresionismo");

        //  Realismo
        gRealismo.add("Pintura # 1 ctg 1");
        gRealismo.add("Pintura # 2 ctg 1");

        AdapterMyListMenu adpt=new AdapterMyListMenu(this,R.layout.ma_lista_prmenu,ctgr);
        lst.setAdapter(adpt);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(getApplicationContext(),MA_realismo.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(getApplicationContext(),MA_Hiperrealismo.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(getApplicationContext(),MA_Surrealismo.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(getApplicationContext(),MA_Impresionismo.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(getApplicationContext(),MA_Expresionismo.class);
                        startActivity(intent4);
                        break;
                }


            }//
        });

    }// fin de agregar elementos

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_welcome:
                Toast.makeText(this, "Has seleccionado la opcion Welcome", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_pinturas:
                Toast.makeText(this, "Has seleccionado la opcion Pinturas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_salir:
                Toast.makeText(this, "Has seleccionado la opcion Salir", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}













































































































































































































































































































































































































































































































































































































































































































































































































































