package com.jvillegas.appactividadpoemasguatemala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void metodo(View view) {
        // boton clasico
        if(view.getId()==R.id.btnClasico){

            Intent inte=new Intent(this,ActClasico.class);
            startActivity(inte);

        }
        // boton infantil
        if(view.getId()==R.id.btnInfantil){
            Intent inte=new Intent(this,ActInfantil.class);
            startActivity(inte);
        }

        // boton patria
        if(view.getId()==R.id.btnPatria){
            Intent inte=new Intent(this,ActPatria.class);
            startActivity(inte);
        }
        if(view.getId()==R.id.btnFinalizar){
            this.finish();
        }


    }
}