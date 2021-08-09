package com.jvillegas.actividad_utilizacindegridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MA_Color extends AppCompatActivity {
    private TextView fieldNombre;
    private ImageView fieldImagen;
    private TextView fieldColor;
    private LinearLayout fieldLinear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_color);
        fieldNombre=findViewById(R.id.lblIdColor);
        fieldImagen=findViewById(R.id.imgIdIcon);
        fieldColor=findViewById(R.id.lblnColor);
        fieldLinear=findViewById(R.id.lnrLayout);

        this.cargarDatos();
    }

    private void cargarDatos(){
        Bundle bundle=getIntent().getExtras();
        String nom=bundle.getString("nombre").toString();
        int img=bundle.getInt("imagen");
        String val1=""+bundle.getInt("valor");
        int val=bundle.getInt("valor");
        fieldNombre.setText(nom);
        fieldImagen.setImageResource(img);
        fieldColor.setText(val1);
        fieldLinear.setBackgroundColor(val);


    }
}