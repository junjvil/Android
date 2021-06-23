package com.jvillegas.apptrasladodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText campoN, campoA, campoE, campoD, campoT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoN=findViewById(R.id.txtNombre);
        campoA=findViewById(R.id.txtApellido);
        campoE=findViewById(R.id.txtEdad);
        campoD=findViewById(R.id.txtDireccion);
        campoT=findViewById(R.id.txtTelefono);
    }

    private void datos(){
        String nombre=campoN.getText().toString();
        String apellido=campoA.getText().toString();
        String edad=campoE.getText().toString();
        String direccion=campoD.getText().toString();
        String telefono=campoT.getText().toString();

        if(!nombre.isEmpty() && !apellido.isEmpty() && !edad.isEmpty() && !direccion.isEmpty() && !telefono.isEmpty()){
            Intent intent=new Intent(this,MA_Receptor.class);
            intent.putExtra("nom",nombre);
            intent.putExtra("ape",apellido);
            intent.putExtra("ed",edad);
            intent.putExtra("dire",direccion);
            intent.putExtra("tel",telefono);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Datos no ingresados",Toast.LENGTH_SHORT).show();
        }

    }// fin del metodo datos

    public void onClick(View view) {
        if(view.getId()==R.id.btnEnviar){
            datos();
        }
    }
}