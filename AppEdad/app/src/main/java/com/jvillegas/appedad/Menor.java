package com.jvillegas.appedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Menor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menor);
    }

    public void finaliza1(View view) {
        if(view.getId()==R.id.btnFinalizar1){
            finish();
        }
    }// fin del metodo finalizar
}