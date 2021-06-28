package com.jvillegas.actividadtrasladodedatosentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText anio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anio=findViewById(R.id.txtAnioP);
    }

    private void validar(){
        //declaracion de variables locales
        String vAnio=anio.getText().toString();

        // condicional
        if(!vAnio.isEmpty()){
            Intent intent=new Intent(this,MA_Validar.class);
            intent.putExtra("anio",vAnio);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Valor no ingresado", Toast.LENGTH_SHORT).show();
        }
    }// fin del metodo validar

    public void ejecutar(View view) {

        // boton validar
        if(view.getId()==R.id.btnValidar){
            this.validar();
        }// fin del boton validar

        //boton salir
        if(view.getId()==R.id.btnSalir){
            finish();
        }// fin del boton  salir

    }// fin del metodo ejecutar
}