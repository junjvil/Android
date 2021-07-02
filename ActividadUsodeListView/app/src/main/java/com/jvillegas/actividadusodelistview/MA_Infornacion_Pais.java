package com.jvillegas.actividadusodelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MA_Infornacion_Pais extends AppCompatActivity {
    private TextView infoPais;
    private ImageView urlImg;
    private TextView dataPais;
    private ImageView visorImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ma_infornacion_pais);

        infoPais=findViewById(R.id.txtPais);
        urlImg=findViewById(R.id.imgBandera);
        dataPais=findViewById(R.id.txtInfo);

        this.cargarData();
    }

    private void cargarData(){
        Bundle bundle=getIntent().getExtras();
        String  pais=bundle.getString("pais");
        int img=bundle.getInt("img");
        int cont=bundle.getInt("contenido");
        this.infoPais.setText(pais);
        this.urlImg.setImageResource(img);
        this.dataPais.setText(cont);

    }

    public void regresar(View view) {
        if(view.getId()==R.id.btnRegresar){
            onBackPressed();
        }
    }
}