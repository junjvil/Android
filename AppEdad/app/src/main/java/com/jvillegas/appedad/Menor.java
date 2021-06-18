package com.jvillegas.appedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Menor extends AppCompatActivity {
    private TextView dato1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menor);
        dato1=findViewById(R.id.lblSuma);
    }

    @Override
    protected void onStart() {
        super.onStart();
        suma();
    }

    private void suma(){
        Random rnd=new Random();

        int n1=rnd.nextInt(200);
        int n2=rnd.nextInt(200);
        String cdn="Suma=> "+n1 +"+"+n2+"=>"+(n1+n2);
        dato1.setText(cdn);

    }

    public void finaliza1(View view) {
        if(view.getId()==R.id.btnFinalizar1){
            finish();
        }
    }// fin del metodo finalizar
}