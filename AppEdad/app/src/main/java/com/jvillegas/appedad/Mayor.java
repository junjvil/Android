package com.jvillegas.appedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Mayor extends AppCompatActivity {
    private TextView dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayor);
        dato=findViewById(R.id.lblResultadoMultiplicacion);
    }

    @Override
    protected void onStart() {
        super.onStart();
        multiplica();
    }

    private void multiplica(){
        Random rnd=new Random();
        int n1=rnd.nextInt(100);
        int n2= rnd.nextInt(100);
        String cdn="Multiplicacion=> "+String.valueOf(n1) +" * "+ String.valueOf(n2) +" => " +String.valueOf((n1*n2));
        dato.setText(cdn);


    }// fin del metodo

    public void finaliza(View view) {
        if(view.getId()==R.id.btnFinalizar){
            finish();
        }
    }// fin del metodo finaliza
}