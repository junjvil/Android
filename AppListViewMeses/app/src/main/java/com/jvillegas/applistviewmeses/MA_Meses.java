package com.jvillegas.applistviewmeses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MA_Meses extends AppCompatActivity {

    private TextView mes, cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_meses);

        mes=findViewById(R.id.txtMes);
        cont=findViewById(R.id.txtContenido);

        this.datos();
    }

    private void datos(){
        Bundle bundle=getIntent().getExtras();
        String mes=bundle.getString("ms");
        int contenido=bundle.getInt("cont");
        this.mes.setText(String.valueOf(mes));
        this.cont.setText(contenido);

    }
}