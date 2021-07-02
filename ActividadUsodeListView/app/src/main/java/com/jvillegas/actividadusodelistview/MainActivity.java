package com.jvillegas.actividadusodelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lst;
    ArrayList<String> pais=new ArrayList<>();
    ArrayList<Integer> img=new ArrayList<>();
    ArrayList<Integer> cntd=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst=findViewById(R.id.lstPaises);

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

    }// fin del metodo onCreate

    public void terminar(View view) {

        //terminar aplicacion
        if(view.getId()==R.id.btnFinalizar){
            finish();
        }//fin del boton terminar

    }// fin del metodo terminar
}