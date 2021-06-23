package com.jvillegas.actividadcomplementaria;

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

    public void onClick(View view) {

        //boton suma
        if(view.getId()==R.id.btnSuma){
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
        }

        //boton resta
        if(view.getId()==R.id.btnResta){
            Intent intent=new Intent(this,MainActivity3.class);
            startActivity(intent);
        }

        //boton multiplicar
        if(view.getId()==R.id.btnMultipliacion){
            Intent intent=new Intent(this,MainActivity4.class);
            startActivity(intent);
        }

        //boton division
        if(view.getId()==R.id.btnDivision){
            Intent intent=new Intent(this,MainActivity5.class);
            startActivity(intent);
        }

        // boton finalizar
        if(view.getId()==R.id.btnSalir){
            this.finish();
        }

    }
}