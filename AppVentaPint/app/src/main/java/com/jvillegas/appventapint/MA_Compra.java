package com.jvillegas.appventapint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MA_Compra extends AppCompatActivity {
    private TextView noc,nocl,ncl,pcl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_compra);
        noc=findViewById(R.id.txtCuadro);
        nocl=findViewById(R.id.txtNameClient);
        ncl=findViewById(R.id.txtNitCliente);
        pcl=findViewById(R.id.txtMontoPagar);
        this.datos();
    }
    private void datos(){
        Bundle b=getIntent().getExtras();
        noc.setText(b.getString("nmp"));
        nocl.setText(b.getString("nmc")+" " +b.getString("apc"));
        ncl.setText(b.getString("ntc"));
        float precio= (float) (Float.parseFloat(b.getString("prcp"))*.12)+Float.parseFloat(b.getString("prcp"));
        pcl.setText(String.valueOf(precio));

    }

    public void onClick(View view) {
        onBackPressed();
    }
}