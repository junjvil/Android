package com.jvillegas.myappmultiplesact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MAIntermedio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintermedio);
    }

    public void pulsar(View view) {
        Intent intent=null;
        if(view.getId()==R.id.btnRegresar){
            intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        if(view.getId()==R.id.btnAvanzar){
            intent=new Intent(this,MAFinal.class);
            startActivity(intent);
        }
    }
}