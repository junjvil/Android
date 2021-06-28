package com.jvillegas.myapplista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MA_Vocales extends AppCompatActivity {

    private ImageView img;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_vocales);

        img=findViewById(R.id.imgVocal);
        text=findViewById(R.id.txtTexto);
        this.recibirImagen();
    }

    private void recibirImagen(){
        Bundle bundle= getIntent().getExtras();
        int imagen=bundle.getInt("imagen");
        int texto=bundle.getInt("texto");
        img.setImageResource(imagen);
        text.setText(texto);
    }
}