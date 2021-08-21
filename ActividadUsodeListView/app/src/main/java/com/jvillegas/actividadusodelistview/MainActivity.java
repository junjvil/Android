package com.jvillegas.actividadusodelistview;

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
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar1;
    private ListView lst;
    ArrayList<String> pais=new ArrayList<>();
    ArrayList<Integer> img=new ArrayList<>();
    ArrayList<Integer> cntd=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst=findViewById(R.id.lstPaises);
        toolbar1=findViewById(R.id.tlbMenu);
        setSupportActionBar(toolbar1);

        //lenado del arraylist
        pais.add("Finlandia");
        pais.add("Islandia");
        pais.add("Israel");
        pais.add("Italia");
        pais.add("Japon");
        pais.add("Malawi");
        pais.add("Rusia");
        pais.add("Eslovenia");
        pais.add("Suiza");
        pais.add("Thailandia");

        //cargando las imagenes
        img.add(R.drawable.ic_finland);
        img.add(R.drawable.ic_iceland);
        img.add(R.drawable.ic_israel);
        img.add(R.drawable.ic_italy);
        img.add(R.drawable.ic_japan);
        img.add(R.drawable.ic_malawi);
        img.add(R.drawable.ic_russia);
        img.add(R.drawable.ic_slovenia);
        img.add(R.drawable.ic_switzerland);
        img.add(R.drawable.ic_thailand);


        // cargando la informacion de poblacion
        cntd.add(R.string.iFinlandia);
        cntd.add(R.string.iIslandia);
        cntd.add(R.string.iIsrael);
        cntd.add(R.string.iItaly);
        cntd.add(R.string.iJapan);
        cntd.add(R.string.iMalawi);
        cntd.add(R.string.iRusia);
        cntd.add(R.string.iSlovenia);
        cntd.add(R.string.iSuiza);
        cntd.add(R.string.iThailandia);




        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,pais);
        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getApplicationContext(),MA_Infornacion_Pais.class);
                intent.putExtra("pais",pais.get(position));
                intent.putExtra("img",img.get(position));
                intent.putExtra("contenido",cntd.get(position));
                startActivity(intent);

            }
        });
        getSupportActionBar().setTitle("Listado de Paises");
    }// fin del metodo onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_list,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){

            case R.id.item_informacion:
                Toast.makeText(this, "Has Seleccionado informacion", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_paises:
                Toast.makeText(this, "Has seleccionado Paises", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item_salir:
                Toast.makeText(this, "Estas saliendo de la aplicacion ", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }


        return super.onOptionsItemSelected(item);
    }

    public void terminar(View view) {

        //terminar aplicacion
        if(view.getId()==R.id.btnFinalizar){
            finish();
        }//fin del boton terminar

    }// fin del metodo terminar
}