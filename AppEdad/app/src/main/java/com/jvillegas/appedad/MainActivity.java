    package com.jvillegas.appedad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // decraracion de campos
    private EditText nombre;
    private EditText edad;
    private TextView msg;
    private TextView msg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=findViewById(R.id.txtNombre);
        edad=findViewById(R.id.txtEdad);
        msg=findViewById(R.id.lblMensaje);
        msg1=findViewById(R.id.lblMensaje1);


    }// fin del metodo onCreate

    private void compara(){
        // declaracion de variables
        int iedad = Integer.parseInt(edad.getText().toString());

        if (iedad>18){

            Intent intent=new Intent(this,Mayor.class);
            startActivity(intent);



        }else{

            Intent intent=new Intent(this,Menor.class);
            startActivity(intent);


        }// validacion

    }// fin del metodo compara

    public void validar(View view) {

        if(view.getId()==R.id.btnValidar){
            compara();}
    }//fin del metodo  validar
}