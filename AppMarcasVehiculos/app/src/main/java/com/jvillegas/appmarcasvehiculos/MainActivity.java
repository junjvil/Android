package com.jvillegas.appmarcasvehiculos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gView;
    ArrayList<String> names=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gView=findViewById(R.id.gdrCentenar);
        vdContenido();

    }// fin dle metodo onCreate-->>
    private void vdContenido(){
        names.add("Audi");
        names.add("Subaru");
        names.add("Lexus");
        names.add("Porsche");
        names.add("BMW");
        names.add("Mazda");
        names.add("Buick");
        names.add("Toyota");
        names.add("Kia");
        names.add("Honda");
        names.add("Hyundai");
        names.add("Volvo");
        names.add("Mini");
        names.add("Mercedez-Benz");

        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,names);
        gView.setAdapter(adapter);
    }


}// fin del metodo MainActivity -- >>