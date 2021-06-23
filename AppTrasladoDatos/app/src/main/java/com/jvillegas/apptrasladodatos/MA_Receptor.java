package com.jvillegas.apptrasladodatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MA_Receptor extends AppCompatActivity {
    private TextView textoN,textoA,textoE,textoD,textoT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_receptor);
        textoN=findViewById(R.id.txtN);
        textoA=findViewById(R.id.txtA);
        textoE=findViewById(R.id.txtE);
        textoD=findViewById(R.id.txtD);
        textoT=findViewById(R.id.txtT);
        this.obtener();
    }

    private void obtener(){
        Bundle bundle=getIntent().getExtras();
        if(bundle != null){
            // obteniendo datos
            String nombre=bundle.getString("nom");
            String apellido=bundle.getString("ape");
            String edad=bundle.getString("ed");
            String direccion=bundle.getString("dire");
            String telefono=bundle.getString("tel");

            //estableciendo datos
            textoN.setText("Nombre:> "+nombre);
            textoA.setText("Apellido:> "+apellido);
            textoE.setText("Edad:> "+edad);
            textoD.setText("Direccion:> "+direccion);
            textoT.setText("Telefono:> "+telefono);

        }

    }
}