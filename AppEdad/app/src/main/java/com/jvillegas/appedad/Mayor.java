package com.jvillegas.appedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Mayor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayor);
    }

    public void finaliza(View view) {
        if(view.getId()==R.id.btnFinalizar){
            finish();
        }
    }// fin del metodo finaliza
}